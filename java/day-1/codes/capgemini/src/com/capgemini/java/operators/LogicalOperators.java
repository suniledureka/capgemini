package com.capgemini.java.operators;

public class LogicalOperators {

	public static void main(String[] args) {
		int x = 13;
		int y = 12;
		int z = 14;

		//boolean result = (x > y) && (x > z++);
		boolean result = (x > y) || (x > z++);
		System.out.println(result);
		System.out.println(z);
	}

}
