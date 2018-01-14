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
    	// char creditCardArray[] = creditCard.toCharArray();
    	for (int i=0; i < getCreditCardLength() ; i++) {
    		int digit = Character.getNumericValue(creditCard.charAt(i));
    		System.out.print("Credit Card Number Position: " + i + "; Digit Value: ");
    		System.out.println(digit);
    	}
    	return true;
    }
}
