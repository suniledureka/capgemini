package com.capgemini.java.except;

public class ThrowTest {

	public static void main(String[] args) {
	  try {	
		calculate(10, 0);
	  }catch(Exception ex) {
		  System.err.println(ex.getMessage());
		  System.err.println(ex.toString());
	  }
	}

	private static void calculate(int i, int j) {
		if(j == 0) {
			//throw new ArithmeticException();
			throw new ArithmeticException("cannot divide an int by zero");
		}
		
		int res = i / j;
		System.out.println("result = " + res);
	}

}
