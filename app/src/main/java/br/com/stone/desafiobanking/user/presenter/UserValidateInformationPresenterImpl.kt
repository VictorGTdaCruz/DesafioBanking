package br.com.stone.desafiobanking.user.presenter

import br.com.stone.desafiobanking.core.util.CPFValidator
import br.com.stone.desafiobanking.core.util.EmailValidator
import br.com.stone.desafiobanking.core.util.NameValidator
import br.com.stone.desafiobanking.user.view.UserValidateInformationView

/**
 * Created on 10/05/2018
 *
 * @author Victor Cruz
 * @email victor.cruz@stone.com.br
 */

class UserValidateInformationPresenterImpl(var mView: UserValidateInformationView,
                                           var mNameValidator: NameValidator,
                                           var mEmailValidator: EmailValidator,
                                           var mCPFValidator: CPFValidator): UserValidateInformationPresenter {

    private var mNameValidated = false
    private var mEmailValidated = false
    private var mCPFValidated = false

    init {
        mView.onNotReadyToValidate()
    }

    override fun userNameChanged(name: String) {
        if (mNameValidator.validate(name)){
            mView.onNameValid()
            mNameValidated = true
        } else {
            mView.onNameInvalid()
            mNameValidated = false
        }

        isReadyToValidate()
    }

    override fun userEmailChanged(email: String) {
        if (mEmailValidator.validate(email)){
            mView.onEmailValid()
            mEmailValidated = true
        } else {
            mView.onEmailInvalid()
            mEmailValidated = false
        }

        isReadyToValidate()
    }

    override fun userCPFChanged(CPF: String) {
        if (mCPFValidator.validate(CPF)){
            mView.onCPFValid()
            mCPFValidated = true
        } else {
            mView.onCPFInvalid()
            mCPFValidated = false
        }

        isReadyToValidate()
    }

    override fun performValidation() {
        mView.onInformationValidated()
    }

    private fun isReadyToValidate(){
        if (mNameValidated && mEmailValidated && mCPFValidated){
            mView.onReadyToValidate()
        } else {
            mView.onNotReadyToValidate()
        }
    }

}