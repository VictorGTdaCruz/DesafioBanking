package br.com.stone.desafiobanking.user.view

/**
 * Created on 10/05/2018
 *
 * @author Victor Cruz
 * @email victor.cruz@stone.com.br
 */
interface UserValidateInformationView {

    fun onNameInvalid()

    fun onEmailInvalid()

    fun onCPFInvalid()

    fun onReadyToValidate()

    fun onNameValid()

    fun onEmailValid()

    fun onCPFValid()

    fun onNotReadyToValidate()

    fun onNameEmpty()

    fun onEmailEmpty()

    fun onCPFEmpty()

    fun resetViewState()

}