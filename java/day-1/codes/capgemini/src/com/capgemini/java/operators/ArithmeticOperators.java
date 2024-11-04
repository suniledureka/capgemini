package com.capgemini.java.operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		System.out.println(10 / 3);
		System.out.println(10f / 3);
		System.out.println(10d / 3);
		System.out.println(10.0 / 3);
		System.out.println();
		
		System.out.println(10 % 3);
		System.out.println(-10 % 3);
		System.out.println(10 % -3);
		System.out.println(-10 % -3);
		System.out.println();
		
		//System.out.println(10 / 0); //java.lang.ArithmeticException
		System.out.println(10.0f / 0); //Infinity
		System.out.println(-10f / 0); //-Infinity
		System.out.println(0.0 / 0); //NaN
		
		byte b1 = 12;
		byte b2 = 23;
		//byte b3 = 35;
		byte b3 = (byte) (b1 + b2);
		System.out.println(b3);
	}

}
