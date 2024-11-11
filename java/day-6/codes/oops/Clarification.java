package com.capgemini.java.oops;

import java.util.Scanner;

public class Clarification {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a/c number: ");
		long acno = sc.nextLong();
		sc.nextLine();
		
		System.out.print("enter a/c holder's name: ");
		String name = sc.nextLine();
		
		System.out.print("enter initial deposit: ");
		float bal = sc.nextFloat();
		
		System.out.println(acno + " | "+ name + " | "+ bal);
	}

}
