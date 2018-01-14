package com.sanyer.tdd.luhn;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.sanyer.tdd.luhn.Luhn;

public class LuhnTest {
    @Test
    public void testCreditCardNotNull() {
        Luhn creditCard = new Luhn();
        Assert.assertNotNull(Double.parseDouble(creditCard.getCreditCard()));
    }

    @Test
    public void testCreditCardLength() {
        Luhn creditCard = new Luhn();
        assertEquals(16, creditCard.getCreditCardLength());
    }

    @Test
    public void testParity() {
        Luhn creditCard = new Luhn();
        assertEquals(0, creditCard.getParity());
    }

    @Test
    public void testLuhnAlgorithmIsValid() {
        Luhn creditCard = new Luhn();
        // assertTrue(creditCard.checkLuhnCCValidity(creditCard.getCreditCard()));  4012888888881881
        assertTrue(creditCard.checkLuhnCCValidity("4012888888881881"));
    }

    @Test
    public void testLuhnAlgorithmIsInvalid() {
        Luhn creditCard = new Luhn();
        // assertTrue(creditCard.checkLuhnCCValidity(creditCard.getCreditCard()));  4012888888881881
        assertFalse(creditCard.checkLuhnCCValidity("4012888888881882"));
    }
}
