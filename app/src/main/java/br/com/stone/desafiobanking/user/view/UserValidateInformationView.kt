package br.com.stone.desafiobanking.user.view

/**
 * Created on 10/05/2018
 *
 * @author Victor Cruz
 * @email victor.cruz@stone.com.br
 */
interface UserValidateInformationView {

    fun onCPFInvalid()

    fun onNameInvalid()

    fun onEmailInvalid()

    fun onReadyToValidate()

}