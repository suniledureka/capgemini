package com.capgemini.java.except;

import java.util.Scanner;

public class ResourceTest {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("enter your name: ");
			String name = sc.nextLine();
			System.out.println("Hello " + name);
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}finally {
			sc.close();
		}
		*/
		
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("enter your name: ");
			String name = sc.nextLine();
			System.out.println("Hello " + name);
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
	}

}
