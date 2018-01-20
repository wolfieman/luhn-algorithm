package com.sanyer.tdd.validator;

import com.sanyer.tdd.core.CreditCard;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class LuhnTest {
    @Test
    public void testCreditCardNull() {
        CreditCard creditCard = new CreditCard(new StringBuffer("4012888888881881"));
        creditCard.setCreditCardNumber(null);

        Assert.assertTrue(creditCard.getCreditCardNumber() == null);
    }

    @Test
    public void testCreditCardEmpty() {
        CreditCard creditCard = new CreditCard(new StringBuffer(""));

        Assert.assertTrue(creditCard.getCreditCardNumber().toString().isEmpty());
    }

    @Test
    public void testCreditCardNotNull() {
        CreditCard creditCard = new CreditCard(new StringBuffer("4012888888881881"));

        Assert.assertNotNull(creditCard.getCreditCardNumber().length() > 0);
    }

    @Test
    public void testCreditCardLength() {
        StringBuffer creditCardNumber = new StringBuffer("4012888888881881");
        int expectedCreditCardNumberLength = creditCardNumber.length();
        CreditCard creditCard = new CreditCard(creditCardNumber);

        assertEquals(expectedCreditCardNumberLength, creditCard.getCreditCardLength());
    }

    @Test
    public void testParity() {
        StringBuffer creditCardNumber = new StringBuffer("4012888888881881");
        CreditCard creditCard = new CreditCard(creditCardNumber);
        int expectedCreditCardNumberParity = creditCard.getParity();

        assertEquals(expectedCreditCardNumberParity, creditCard.getParity());
    }

    @Test
    public void testLuhnAlgorithmIsValid() {
        StringBuffer creditCardNumber = new StringBuffer("4012888888881881");
        CreditCard creditCard = new CreditCard(creditCardNumber);
        assertTrue(creditCard.getCreditCardValidator().checkLuhnCCValidity(creditCard));
    }

    @Test
    public void testLuhnAlgorithmIsInvalid() {
        StringBuffer creditCardNumber = new StringBuffer("4012888888881882");
        CreditCard creditCard = new CreditCard(creditCardNumber);
        assertFalse(creditCard.getCreditCardValidator().checkLuhnCCValidity(creditCard));
    }
}
