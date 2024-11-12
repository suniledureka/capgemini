package com.capgemini.java.oops.bank;

public class SavingsAccount extends Account {
	float roi;

	public SavingsAccount(long acno, String name, float bal, float roi) {
		super(acno, name, bal);
		this.roi = roi;
	}
	
	void calculateInterest() {
		float intrst = this.bal * this.roi /100;
		System.out.println("Accumulated Interest = " + intrst);
		super.deposit(intrst);
	}
	
}
