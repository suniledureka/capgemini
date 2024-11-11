package com.capgemini.java.oops.bank;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc = null;
		float amt;
		
		while(true) {
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Details");
			System.out.println("5. Interest Calculation");
			System.out.println("6. Service Charge");
			System.out.println("7. Exit");
			
			System.out.print("enter an option: ");
			int opt = sc.nextInt();
			
			switch(opt) {
			 case 1:
				 if(acc == null) {
					System.out.print("enter a/c no: ");
					long acno = sc.nextLong();
					sc.nextLine();
					
					System.out.print("enter name: ");
					String name = sc.nextLine();
					
					System.out.print("enter initial deposit: ");
					amt = sc.nextFloat();
					
					System.out.print("enter the type of account required? [1. Savings | 2. Current] ");
					int accType = sc.nextInt();
					
					if(accType == 1) {
						System.out.print("enter roi: ");
						float roi = sc.nextFloat();
						acc = new SavingsAccount(acno, name, amt, roi);
					}else {
						acc = new CurrentAccount(acno, name, amt);
					}
					
					System.out.println("Welcome to State Bank of India - " + acc.getClass().getSimpleName().toUpperCase());
				 }else {
					 System.err.println("A/C already with Us:: ");
				 }
				break;
			 case 2:
		      if(acc != null) {		 
				System.out.print("enter amount to deposit: ");
				amt = sc.nextFloat();
				acc.deposit(amt);
		      }else {
		    	  System.err.println("Please open an A/C with Us!!!");
		      }
				break;
			 case 3:
				if(acc == null) {
					System.err.println("Please open an A/C with Us!!!");
				}else {
					System.out.print("enter amount to withdraw: ");
					amt = sc.nextFloat();
					acc.withdraw(amt);
				}
				break;
			 case 4:
				 if(acc != null)
					 acc.getDetails();
				 else
					 System.err.println("Please open an A/C with Us!!!");
				break;
			 case 5:
			   if(acc != null) {	 
				 if(acc instanceof SavingsAccount) {
					 ((SavingsAccount) acc).calculateInterest();
				 }else {
					 System.err.println("Interest Calculation is applicable only for Savings Account");
				 }
			   }
			   else
					 System.err.println("Please open an A/C with Us!!!");
				 break;
			 case 6:
			   if(acc != null) {	 
				 if(acc instanceof CurrentAccount) {
					 ((CurrentAccount)acc).serviceCharge();
				 }else {
					 System.err.println("Service Charge is applicable only for Current Account");
				 }
			   }
			   else
					 System.err.println("Please open an A/C with Us!!!");
				 break;
			 case 7:
				System.out.println("BYE BYE"); 
				System.out.println("Application Designed & Developed by Capgemini!!");
				System.exit(0);
				break;	
		     default:
		    	 System.err.println("Invalid Option --- Try Again");
			}
			System.out.println("-".repeat(100));
		}//while
	}
}
