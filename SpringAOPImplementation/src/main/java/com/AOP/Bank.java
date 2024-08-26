package com.AOP;

public class Bank {
	public void openBankAccount() {
		System.out.println("Welcome to Bank");
	}
	public void activateDebitCard() {
		String cardNo="KOT101124";
		System.out.println("Card Number is:"+cardNo);
	
	}
	public void doTransaction() {
		System.out.println("Enjoy unlimited access!");
	}

}
