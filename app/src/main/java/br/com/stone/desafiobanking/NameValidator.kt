package br.com.stone.desafiobanking

/**
 * Created on 09/05/2018
 *
 * @author Victor Cruz
 * @email victor.cruz@stone.com.br
 */

class NameValidator {

    companion object {

        fun validate(name: String): Boolean{
            if (name.length in 4..60){
                val nameSplit = name.split(" ")
                if(nameSplit.size > 1 && !nameSplit[1].isEmpty()){
                    return true
                }
            }

            return false
        }

    }

}