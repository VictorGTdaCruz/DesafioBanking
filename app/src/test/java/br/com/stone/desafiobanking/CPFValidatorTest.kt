package br.com.stone.desafiobanking

import br.com.stone.desafiobanking.core.util.CPFValidator
import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created on 09/05/2018
 *
 * @author Victor Cruz
 * @email victor.cruz@stone.com.br
 */

class CPFValidatorTest {

    private lateinit var mCPFValidator: CPFValidator

    @Before
    fun setup(){
        mCPFValidator = CPFValidator()
    }

    @Test
    fun cpfValidator_CorrectCPF_ReturnsTrue(){
        Assert.assertTrue(mCPFValidator.validate("72314230353"))
    }

    @Test
    fun cpfValidator_FalsePositive_ReturnsFalse(){
        Assert.assertFalse(mCPFValidator.validate("12314230353"))
    }

    @Test
    fun cpfValidator_AlphaNumeric_ReturnsFalse(){
        Assert.assertFalse(mCPFValidator.validate("@#%$*.,#@!%"))
    }

    @Test
    fun cpfValidator_FewerLettersThanAllowed_ReturnsFalse(){
        Assert.assertFalse(mCPFValidator.validate("7231423035"))
    }

    @Test
    fun cpfValidator_MoreLettersThanAllowed_ReturnsFalse(){
        Assert.assertFalse(mCPFValidator.validate("723142303531"))
    }

}