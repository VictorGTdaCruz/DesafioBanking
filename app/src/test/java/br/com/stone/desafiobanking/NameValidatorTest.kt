package br.com.stone.desafiobanking

import br.com.stone.desafiobanking.core.util.NameValidator
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Created on 09/05/2018
 *
 * @author Victor Cruz
 * @email victor.cruz@stone.com.br
 */
class NameValidatorTest {

    @Test
    fun nameValidator_CorrectName_ReturnsTrue(){
        assertTrue(NameValidator.validate("Victor Cruz"))
    }

    @Test
    fun nameValidator_OnlyFirstName_ReturnsFalse(){
        assertFalse(NameValidator.validate("Victor"))
    }

    @Test
    fun nameValidator_OnlyLastName_ReturnsFalse(){
        assertFalse(NameValidator.validate("Cruz"))
    }

    @Test
    fun nameValidator_FewerLettersThanAllowed_ReturnsFalse(){
        assertFalse(NameValidator.validate("Vic"))
    }

    @Test
    fun nameValidator_MoreLettersThanAllowed_ReturnsFalse(){
        assertFalse(NameValidator.validate("Victor CruzVictor CruzVictor CruzVictor CruzVictor CruzVictor Cruz"))
    }

}