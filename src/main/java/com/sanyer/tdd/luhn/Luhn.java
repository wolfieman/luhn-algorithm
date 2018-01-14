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
    		System.out.print("Credit Card Number Position: " + i + "; Digit Value: ");
    		System.out.print(digit);

    		if (i % 2 == getParity()) {
    			digit = digit * 2;
    		}
    		if (digit > 9) {
    			digit = digit - 9;
    		}

    		sum = sum + digit;
    		System.out.println("; Doubled? " + digit);
    	}
    	System.out.println("Sum of digits: " + sum);

    	boolean isValid = (sum % 10) == 0;
    	System.out.println("Is Credit Card valid?: " + isValid);

    	return isValid;
    }
}
