package com.capgemini.java.controls;

import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter your name: ");
		//String name = sc.next();
		String name = sc.nextLine();
		System.out.println();
		
		System.out.println("Hello " + name + ", welcome to Capgemini");
	}

}
