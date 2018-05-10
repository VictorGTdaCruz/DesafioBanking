package br.com.stone.desafiobanking.user.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import br.com.stone.desafiobanking.R
import kotlinx.android.synthetic.main.activity_user_validate_information.*

class UserValidateInformationActivity : AppCompatActivity(), UserValidateInformationView{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_validate_information)
    }

    override fun onStart() {
        super.onStart()

        edit_name.addTextChangedListener(editNameOnTextChangedListener())
        edit_name.addTextChangedListener(editEmailOnTextChangedListener())
        edit_name.addTextChangedListener(editCPFOnTextChangedListener())
        btn_confirm.setOnClickListener(btnConfirmOnClickListener())

    }

    override fun onCPFInvalid() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onNameInvalid() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onEmailInvalid() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onReadyToValidate() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun editNameOnTextChangedListener(): TextWatcher{
        return object : TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

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

            }
        }
    }

    private fun btnConfirmOnClickListener(): View.OnClickListener{
        return View.OnClickListener {

        }
    }

}
