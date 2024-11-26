package com.capgemini.java.threads;

public class SynchronizationTest {

	public static void main(String[] args) {
		Account sunilsAcc = new Account(7000f);
		
		UPIPayment gPay = new UPIPayment(sunilsAcc);
		DebitCard dCard = new DebitCard(sunilsAcc);
		
		gPay.start();
		dCard.start();
	}

}
