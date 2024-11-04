package com.capgemini.java.operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		int c = 13;
		
		//boolean result = (a>b) && (a>c++);
		boolean result = (a>b) & (a>c++);
		System.out.println(result);
		System.out.println(c);
		System.out.println();
		
		System.out.println(10 & 15); //10
		System.out.println(10 | 15); //15
		System.out.println(10 ^ 15); //5
	}

}
