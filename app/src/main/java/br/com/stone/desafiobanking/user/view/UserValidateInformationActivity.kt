package br.com.stone.desafiobanking.user.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import br.com.stone.desafiobanking.R
import br.com.stone.desafiobanking.core.util.CPFValidator
import br.com.stone.desafiobanking.core.util.EmailValidator
import br.com.stone.desafiobanking.core.util.NameValidator
import br.com.stone.desafiobanking.user.presenter.UserValidateInformationPresenter
import br.com.stone.desafiobanking.user.presenter.UserValidateInformationPresenterImpl
import kotlinx.android.synthetic.main.activity_user_validate_information.*

class UserValidateInformationActivity : AppCompatActivity(), UserValidateInformationView{

    lateinit var mPresenter: UserValidateInformationPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_validate_information)

        mPresenter = UserValidateInformationPresenterImpl(this, NameValidator(), EmailValidator(), CPFValidator())
    }

    override fun onStart() {
        super.onStart()

        edit_name.addTextChangedListener(editNameOnTextChangedListener())
        edit_email.addTextChangedListener(editEmailOnTextChangedListener())
        edit_cpf.addTextChangedListener(editCPFOnTextChangedListener())
        btn_confirm.setOnClickListener(btnConfirmOnClickListener())

    }

    override fun onNameInvalid() {
        invalidEditText(edit_name)
    }

    override fun onEmailInvalid() {
        invalidEditText(edit_email)
    }

    override fun onCPFInvalid() {
        invalidEditText(edit_cpf)
    }

    override fun onNameValid() {
        validEditText(edit_name)
    }

    override fun onEmailValid() {
        validEditText(edit_email)
    }

    override fun onCPFValid() {
        validEditText(edit_cpf)
    }

    override fun onReadyToValidate() {
        btn_confirm.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
        btn_confirm.isClickable = true
    }

    override fun onNotReadyToValidate() {
        btn_confirm.setBackgroundResource(android.R.drawable.btn_default)
        btn_confirm.isClickable = false
    }

    override fun onInformationValidated() {
        edit_name.setText("")
        edit_email.setText("")
        edit_cpf.setText("")
        resetEditText(edit_name)
        resetEditText(edit_email)
        resetEditText(edit_cpf)
        onNotReadyToValidate()
        // show dialog
    }

    private fun editNameOnTextChangedListener(): TextWatcher{
        return object : TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                mPresenter.userNameChanged(p0.toString())
            }
        }
    }

    private fun editEmailOnTextChangedListener(): TextWatcher{
        return object : TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                mPresenter.userEmailChanged(p0.toString())
            }
        }
    }

    private fun editCPFOnTextChangedListener(): TextWatcher{
        return object : TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                mPresenter.userCPFChanged(p0.toString())
            }
        }
    }

    private fun btnConfirmOnClickListener(): View.OnClickListener{
        return View.OnClickListener {
            mPresenter.performValidation()
        }
    }

    private fun validEditText(editText: EditText){
        editText.setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, getDrawable(R.drawable.ic_done_black_24dp), null)
    }

    private fun invalidEditText(editText: EditText){
        editText.setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, getDrawable(R.drawable.ic_not_interested_black_24dp), null)
    }

    private fun resetEditText(editText: EditText){
        editText.setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, null, null)
    }

}
