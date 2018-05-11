package br.com.stone.desafiobanking

import br.com.stone.desafiobanking.core.util.NameValidator
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

/**
 * Created on 09/05/2018
 *
 * @author Victor Cruz
 * @email victor.cruz@stone.com.br
 */
class NameValidatorTest {

    private lateinit var mNameValidator: NameValidator

    @Before
    fun setup(){
        mNameValidator = NameValidator()
    }

    @Test
    fun nameValidator_CorrectName_ReturnsTrue(){
        assertTrue(mNameValidator.validate("Victor Cruz"))
    }

    @Test
    fun nameValidator_OnlyFirstName_ReturnsFalse(){
        assertFalse(mNameValidator.validate("Victor"))
    }

    @Test
    fun nameValidator_OnlyLastName_ReturnsFalse(){
        assertFalse(mNameValidator.validate("Cruz"))
    }

    @Test
    fun nameValidator_FewerLettersThanAllowed_ReturnsFalse(){
        assertFalse(mNameValidator.validate("Vic"))
    }

    @Test
    fun nameValidator_MoreLettersThanAllowed_ReturnsFalse(){
        assertFalse(mNameValidator.validate("Victor CruzVictor CruzVictor CruzVictor CruzVictor CruzVictor Cruz"))
    }

}