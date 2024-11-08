package com.capgemini.java.oops.bank;

public class Account {
	long acno;
	String name;
	float bal;
	
	public Account(long acno, String name, float bal) {
		this.acno = acno;
		this.name = name;
		this.bal = bal;
	}

	void getDetails(){
		System.out.println("A/C NO: " + acno + " | NAME: "+name + " | BALANCE: " + bal);
	}
	
	void deposit(float amt){
		this.bal = this.bal + amt;
		System.out.println("Rs." + amt + " Credited | Balance: " + this.bal);
	}

	void withdraw(float amt) {
		if(this.bal >= amt) {
			this.bal -= amt;
			System.out.println("Rs."+amt+ " Debited | Balance: "+this.bal);
		}else {
			System.err.println("ERROR: Insufficient Balance");
		}
		
	}
}
