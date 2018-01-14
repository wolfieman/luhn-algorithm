package com.sanyer.tdd.luhn;

public class Luhn {
	private String creditCard = "4012888888881881";
	private int sum = 0;
	private int creditCardLength = creditCard.length();
	private int parity = creditCardLength % 2; 


    public String getCreditCard () {
    	return this.creditCard;
    }

    public void setCreditCard (String creditCard) {
    	this.creditCard = creditCard;
    }

    public int getCreditCardLength () {
    	return this.creditCardLength;
    }

    public int getParity () {
    	return this.parity;
    }

    public boolean checkLuhnCCValidity (String creditCard) {
    	
    	for (int i=0; i < getCreditCardLength() ; i++) {
    		int digit = Character.getNumericValue(creditCard.charAt(i));
    		int doubledDigit = 0;
    		if (i % 2 == getParity()) {
    			doubledDigit = digit * 2;	// refactor afterwards to just digit, no need for doubledDigit to exist
    		}
    		if (doubledDigit > 9) {
    			doubledDigit = doubledDigit - 9;
    		}
    		System.out.print("Credit Card Number Position: " + i + "; Digit Value: ");
    		System.out.print(digit);
    		System.out.println("; Doubled? " + doubledDigit);
    	}
    	return true;
    }
}
