package com.capgemini.java.except;

import java.util.Scanner;

public class Doubt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("enter a number: ");
		int n = sc.nextInt();
		System.out.println(n);
		*/
		System.out.print("enter a number: ");
		String input = sc.next();
		System.out.println(input);
		//int n = Integer.parseInt(input);		
		float n = Float.parseFloat(input);
		System.out.println(n);
		
		sc.close();
	}

}
