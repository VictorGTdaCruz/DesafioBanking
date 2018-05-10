package br.com.stone.desafiobanking.core.util

/**
 * Created on 10/05/2018
 *
 * @author Victor Cruz
 * @email victor.cruz@stone.com.br
 */

class EmailValidator {

    companion object {

        fun validate(email: String): Boolean{
            if ("[a-z0-9!#\$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#\$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+(?:[A-Z]{2}|com|org|net|gov|mil|biz|info|mobi|name|aero|jobs|museum)\\b".toRegex().matches(email)){
                return true
            }

            return false
        }

    }

}
