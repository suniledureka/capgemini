package com.capgemini.java.operators;

public class BitwsieOperator {

	public static void main(String[] args) {
		int x = 13;
		int y = 12;
		int z = 14;

		//boolean result = (x > y) && (x > z++);
		boolean result = (x > y) | (x > z++);
		System.out.println(result);
		System.out.println(z);
		
		System.out.println(10 & 15); //10
		System.out.println(10 | 15); //15
		System.out.println(10 ^ 15); //5
	}

}
