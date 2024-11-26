package com.capgemini.java.threads;

public class DebitCard extends Thread {
	Account account;

	public DebitCard(Account account) {
		super();
		this.account = account;
	}
	
	public void run() {
		account.withdraw(4000f);
	}
}
