package com.capgemini.java.except;

import java.io.IOException;
import java.util.Scanner;

public class ChainedExceptTest {
	
	static void divNum() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter first no: ");
		int x = sc.nextInt();
		
		System.out.print("enter second no: ");
		int y = sc.nextInt();
		
		if(y == 0) {
				ArithmeticException ex = new ArithmeticException("cannot divide an int by 0");
				ex.initCause(new IOException("invalid input"));
				throw ex;			
		}
		int z = x / y;
		System.out.println("result = " + z);
		sc.close();
	}
	
	public static void main(String[] args) {
		try {
			divNum();
		}catch(Exception ex) {
			System.err.println(ex);
			Throwable cause = ex.getCause();
			System.err.println(cause);
		}

	}

}
