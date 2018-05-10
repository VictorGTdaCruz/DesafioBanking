package br.com.stone.desafiobanking.user.presenter

/**
 * Created on 10/05/2018
 *
 * @author Victor Cruz
 * @email victor.cruz@stone.com.br
 */
interface UserValidateInformationPresenter {

    fun userNameChanged(name: String)

    fun userEmailChanged(name: String)

    fun userCPFChanged(name: String)

    fun performValidation()

}