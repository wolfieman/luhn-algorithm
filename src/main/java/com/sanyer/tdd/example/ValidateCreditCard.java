package com.sanyer.tdd.example;

import com.sanyer.tdd.core.CreditCard;

import java.util.Arrays;
import java.util.List;

public class ValidateCreditCard {
    public static void main(String[] args){
		String creditCards[] = {"4012888888881881", "4012888888881882"};

		StringBuffer creditCardsBuffer[] = new StringBuffer[creditCards.length];
        for (int i = 0; i < creditCards.length; i++) {
            creditCardsBuffer[i] = new StringBuffer(creditCards[i]);
        }


        List<StringBuffer> creditCardsList = Arrays.asList(creditCardsBuffer);

    	System.out.println("Luhn Algorithm Java Implementation:");
        creditCardsList.stream().forEach(creditCard -> {
            CreditCard creditCardInstance = new CreditCard(creditCard);
            boolean isValid = creditCardInstance.getCreditCardValidator().checkLuhnCCValidity(creditCardInstance);
            System.out.println("Credit Card: " + creditCard + " is " + ( (isValid) ? "valid" : "not valid"));
        });
	}
}
