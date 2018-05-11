package br.com.stone.desafiobanking

import br.com.stone.desafiobanking.core.util.EmailValidator
import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created on 10/05/2018
 *
 * @author Victor Cruz
 * @email victor.cruz@stone.com.br
 */

class EmailValidatorTest {

    private lateinit var mEmailValidator: EmailValidator

    @Before
    fun setup(){
        mEmailValidator = EmailValidator()
    }

    @Test
    fun emailValidator_CorrectEmail_ReturnsTrue(){
        Assert.assertTrue(mEmailValidator.validate("me@domain.com"))
    }

    @Test
    fun emailValidator_InvalidDomain_ReturnsFalse(){
        Assert.assertFalse(mEmailValidator.validate("me@domain.bom"))
    }

    @Test
    fun emailValidator_SpecialChars_ReturnsFalse(){
        Assert.assertFalse(mEmailValidator.validate("me∞♫♬♭♮♯@domain.com"))
    }

    @Test
    fun emailValidator_UnicodeChars_ReturnsFalse(){
        Assert.assertFalse(mEmailValidator.validate("あいうえお@domain.com"))
    }

    @Test
    fun emailValidator_NoAT_ReturnsFalse(){
        Assert.assertFalse(mEmailValidator.validate("me.domain.com"))
    }

    @Test
    fun emailValidator_LeadingDotInAddress_ReturnsFalse(){
        Assert.assertFalse(mEmailValidator.validate(".me@domain.com"))
    }

    @Test
    fun emailValidator_MultipleDots_ReturnsFalse(){
        Assert.assertFalse(mEmailValidator.validate("me..me@domain.bom"))
    }


}