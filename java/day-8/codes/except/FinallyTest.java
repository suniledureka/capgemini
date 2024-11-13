package com.capgemini.java.except;

import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("enter a number: ");
			int x = sc.nextInt();
			
			System.out.print("enter another number: ");
			int y = sc.nextInt();
			
			int z = x / y;
			System.out.printf("%d / %d = %d\n", x, y, z);
			//return;
			System.exit(0);
		}catch(ArithmeticException ex) {
			System.err.println(ex.toString());
		}finally {
			System.out.println("---- finally block---");
			System.out.println("application designed & developed by");
			System.out.println("team @ capgemini");
			sc.close();
		}
		System.out.println("-- done --");		
	}

}
