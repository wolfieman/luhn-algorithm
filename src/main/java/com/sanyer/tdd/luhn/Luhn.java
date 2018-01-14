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
}
