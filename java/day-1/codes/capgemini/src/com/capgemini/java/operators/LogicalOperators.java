package com.capgemini.java.operators;

public class LogicalOperators {

	public static void main(String[] args) {
		int a = 101;
		int b = 12;
		int c = 130;
		
		boolean result = (a>b) && (a>c++);
		System.out.println(result);
		System.out.println(c);
	}

}
