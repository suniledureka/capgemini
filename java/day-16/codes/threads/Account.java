package com.capgemini.java.threads;

public class Account {
	private float balance;

	public Account(float balance) {
		super();
		this.balance = balance;
	}
	
	synchronized public void deposit(float amt) {
		this.balance += amt;
		System.out.println("Rs."+amt+" Credited || Balance: " + this.balance);
	}
	
	synchronized public void withdraw(float amt) {
		if(this.balance >= amt) {
			this.balance -= amt;
			System.out.println("Rs."+amt+" Debited || Balance: " + this.balance);
		}
	}
}
