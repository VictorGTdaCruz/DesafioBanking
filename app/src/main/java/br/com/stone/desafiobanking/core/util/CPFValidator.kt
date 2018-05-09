package br.com.stone.desafiobanking.core.util

/**
 * Created on 09/05/2018
 *
 * @author Victor Cruz
 * @email victor.cruz@stone.com.br
 */

class CPFValidator {

    companion object {

        fun validate(CPF: String): Boolean{
            if (CPF.length == 11){
                if (CPF.matches("^[0-9]*\$".toRegex())) {
                    val firstVerificationDigit = CPF[9].toString().toInt()
                    val secondVerificationDigit = CPF[10].toString().toInt()

                    if (calculateVerificationDigit(CPF.subSequence(0, 9).toString()) == firstVerificationDigit) {
                        if (calculateVerificationDigit(CPF.subSequence(0, 10).toString()) == secondVerificationDigit) {
                            return true
                        }
                    }
                }
            }

            return false
        }

        private fun calculateVerificationDigit(CPF: String): Int{
            var i: Int = when {
                CPF.length == 9 -> 10
                CPF.length == 10 -> 11
                else -> return -1
            }

            var amount = 0

            for (c in CPF){
                amount += c.toString().toInt() * i
                i--
            }

            return 11 - (amount % 11)
        }

    }

}