package com.sanyer.tdd.luhn;

public class Luhn {
	private String creditCard = "";
	private int sum = 0;
	private int creditCardLength = 0;
	private int parity = 0;

	public static void main(String[] args){
		String creditCards[] = {"4012888888881881", "4012888888881882"};
    	System.out.println("Luhn Algorithm Java Implementation:");
    	Luhn creditCard = new Luhn();

    	for (int i = 0; i < creditCards.length; i++) {
    		creditCard.checkLuhnCCValidity(creditCards[i]);
    	}
	} 

    public String getCreditCard () {
    	return this.creditCard;
    }

    public void setCreditCard (String creditCard) {
    	this.creditCard = creditCard;
    }

    public int getCreditCardLength () {
    	return this.creditCardLength;
    }

    public void setCreditCardLength (int length) {
    	this.creditCardLength = length;
    }

    public int getParity () {
    	return this.parity;
    }

    public void setParity (int parity) {
    	this.parity = parity;
    }

    public int doubleIfParity (int index, int digit) {
    	if (index % 2 == getParity()) {
    			digit = digit * 2;
    	}
    	return digit;
    }

    public int adjustDigitIfGreaterThanNine (int digit) {
    	if (digit > 9) {
    			digit = digit - 9;
    	}
    	return digit;
    }

    public void printMessage(boolean isValid, String creditCard) {
    	if (isValid) {
    		System.out.println("Credit Card " + creditCard + " is valid.");
    	} else {
    		System.out.println("Credit Card " + creditCard + " is not valid.");
    	}
    }

    public boolean checkLuhnCCValidity (String creditCard) {
    	boolean isValid = false;
    	if (!creditCard.isEmpty()) {
	    	this.creditCardLength = creditCard.length();
	    	this.parity = creditCardLength % 2;

	    	for (int i=0; i < getCreditCardLength() ; i++) {
	    		int digit = Character.getNumericValue(creditCard.charAt(i));

	    		digit = adjustDigitIfGreaterThanNine(doubleIfParity(i, digit));

	    		sum = sum + digit;
	    	}

	    	isValid = (sum % 10) == 0;
	    	
	    	printMessage(isValid, creditCard);
	    	return isValid;
    	}
    	return isValid;
    }
}
