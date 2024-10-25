package com.capgemini.java.operators;

import java.util.Scanner;

public class ReadDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter your name: ");
		//String name = sc.next();
		String name = sc.nextLine();
		
		System.out.println("Hi " + name + ", welcome to Capgemini");
		sc.close();
	}
}
