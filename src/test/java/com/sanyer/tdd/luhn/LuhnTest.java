package com.sanyer.tdd.luhn;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.sanyer.tdd.luhn.Luhn;

public class LuhnTest {
    @Test
    public void testCreditCardNotNull() {
        Luhn creditCard = new Luhn();
        Assert.assertNotNull(Double.parseDouble(creditCard.getCreditCard()));
    }

    @Test
    public void testCreditCardLegth() {
        Luhn creditCard = new Luhn();
        assertEquals(16, creditCard.getCreditCard().length());
    }
}
