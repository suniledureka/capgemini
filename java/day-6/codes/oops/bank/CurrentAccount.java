package com.capgemini.java.oops.bank;

public class CurrentAccount extends Account {
	int transactionCount;
	int allowedTransactions = 3;
	
	public CurrentAccount(long acno, String name, float bal) {
		super(acno, name, bal);
	}
	
	void serviceCharge() {
		int additionalTrans = transactionCount - allowedTransactions;
		if(additionalTrans > 0) {
			float charge = additionalTrans * 100;
			System.out.println("Service Charge = " + charge);
			super.withdraw(charge);
			
			transactionCount = 0;
		}else {
			System.out.println("No Service Charges are Application now!!!");
		}
	}

	@Override
	void getDetails() {
		transactionCount++;
		super.getDetails();
	}

	@Override
	void deposit(float amt) {
		transactionCount++;
		super.deposit(amt);
	}

	@Override
	void withdraw(float amt) {
		transactionCount++;
		super.withdraw(amt);
	}
	
	
}
