package br.com.stone.desafiobanking

import br.com.stone.desafiobanking.core.util.CPFValidator
import br.com.stone.desafiobanking.core.util.EmailValidator
import br.com.stone.desafiobanking.core.util.NameValidator
import br.com.stone.desafiobanking.user.presenter.UserValidateInformationPresenter
import br.com.stone.desafiobanking.user.presenter.UserValidateInformationPresenterImpl
import br.com.stone.desafiobanking.user.view.UserValidateInformationView
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

/**
 * Created on 11/05/2018
 *
 * @author Victor Cruz
 * @email victor.cruz@stone.com.br
 */

@RunWith(MockitoJUnitRunner::class)
class UserValidateInformationPresenterTest {

    private lateinit var mPresenter: UserValidateInformationPresenter

    @Mock
    lateinit var mMockView: UserValidateInformationView

    @Before
    fun setup(){
        mPresenter = UserValidateInformationPresenterImpl(mMockView, NameValidator(), EmailValidator(), CPFValidator())
    }

    @Test
    fun userValidateInformationPresenter_IncorrectName_ReturnsTrue(){

        mPresenter.userNameChanged("Victor")
        verify(mMockView).onNameInvalid()

    }

    @Test
    fun userValidateInformationPresenter_IncorrectEmail_ReturnsTrue(){

        mPresenter.userEmailChanged("email.com")
        verify(mMockView).onEmailInvalid()

    }

    @Test
    fun userValidateInformationPresenter_IncorrectCPF_ReturnsTrue(){

        mPresenter.userCPFChanged("14359417755")
        verify(mMockView).onCPFInvalid()

    }

    @Test
    fun userValidateInformationPresenter_CorrectInformation_ReturnsTrue(){

        mPresenter.userNameChanged("Victor Cruz")
        mPresenter.userEmailChanged("email@email.com")
        mPresenter.userCPFChanged("72314230353")
        verify(mMockView).onReadyToValidate()

    }

}