package com.sanyer.tdd.luhn;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.sanyer.tdd.luhn.Luhn;

public class LuhnTest {
    @Test
    public void testCreditCardNull() {
        Luhn creditCard = new Luhn();
        Assert.assertTrue(creditCard.getCreditCard().isEmpty());
    }

    @Test
    public void testCreditCardEmpty() {
        Luhn creditCard = new Luhn();
        creditCard.setCreditCard("");
        Assert.assertTrue(creditCard.getCreditCard().isEmpty());
    }

    @Test
    public void testCreditCardNotNull() {
        Luhn creditCard = new Luhn();
        creditCard.setCreditCard("4012888888881881");
        Assert.assertNotNull(Double.parseDouble(creditCard.getCreditCard()));
    }

    @Test
    public void testCreditCardLength() {
        Luhn creditCard = new Luhn();
        creditCard.setCreditCardLength(16);
        assertEquals(16, creditCard.getCreditCardLength());
    }

    @Test
    public void testParity() {
        Luhn creditCard = new Luhn();
        creditCard.setCreditCardLength(16);
        creditCard.setParity(creditCard.getCreditCardLength() % 2);
        assertEquals(0, creditCard.getParity());
    }

    @Test
    public void testLuhnAlgorithmIsValid() {
        Luhn creditCard = new Luhn();
        creditCard.setCreditCard("4012888888881881");
        assertTrue(creditCard.checkLuhnCCValidity(creditCard.getCreditCard()));
    }

    @Test
    public void testLuhnAlgorithmIsInvalid() {
        Luhn creditCard = new Luhn();
        creditCard.setCreditCard("4012888888881882");
        assertFalse(creditCard.checkLuhnCCValidity(creditCard.getCreditCard()));
    }
}
