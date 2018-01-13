package com.sanyer.tdd.luhn;

import org.junit.Test;
import org.junit.Assert;
import com.sanyer.tdd.luhn.Luhn;

public class LuhnTest {
    @Test
    public void testCreditCardNotNull() {
        Luhn creditCard = new Luhn();
        Assert.assertNotNull(Integer.parseInt(creditCard.getCreditCard()));
    }
}
