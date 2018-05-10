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

class UserValidateInformationPresenterImpl(mView: UserValidateInformationView,
                                           mNameValidator: NameValidator,
                                           mEmailValidator: EmailValidator,
                                           mCPFValidator: CPFValidator): UserValidateInformationPresenter {

    override fun userNameChanged(name: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun userEmailChanged(name: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun userCPFChanged(name: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun performValidation() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    
}