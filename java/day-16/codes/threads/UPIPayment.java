package com.capgemini.java.threads;

public class UPIPayment extends Thread {
	Account account;

	public UPIPayment(Account account) {
		super();
		this.account = account;
	}
	
	public void run() {
		account.deposit(6000);
	}
	
}
