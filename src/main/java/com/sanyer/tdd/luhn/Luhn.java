package com.sanyer.tdd.luhn;

public class Luhn {
	private String creditCard = "4012888888881881";
	// private String creditCards[] = {"4012888888881881", "4012888888881881"};
	private int sum = 0;
	private int creditCardLength = creditCard.length();
	private int parity = creditCardLength % 2;

	public static void main(String[] args){
		String creditCards[] = {"4012888888881881", "4012888888881882"};
    	System.out.println("Hello World!");
    	Luhn creditCard = new Luhn();

    	for (int i = 0; i < creditCards.length; i++) {
    		// System.out.println(i);
    		// System.out.println(creditCards[i]);
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

    public int getParity () {
    	return this.parity;
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

    public void printMessage(boolean isValid) {
    	if (isValid) {
    		System.out.println("Credit Card " + creditCard + " is valid.");
    	} else {
    		System.out.println("Credit Card " + creditCard + " is not valid.");
    	}
    }

    public boolean checkLuhnCCValidity (String creditCard) {
    	
    	for (int i=0; i < getCreditCardLength() ; i++) {
    		int digit = Character.getNumericValue(creditCard.charAt(i));

    		digit = adjustDigitIfGreaterThanNine(doubleIfParity(i, digit));

    		sum = sum + digit;
    	}

    	boolean isValid = (sum % 10) == 0;
    	
    	printMessage(isValid);

    	return isValid;
    }
}
