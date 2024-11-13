package com.capgemini.java.wrapper;

public class WideningVsBoxing {
	
	static void add(int x, int y) {
		System.out.println("int, int");
		System.out.println("sum = " + (x+y));
	}


	static void add(long x, int y) {
		System.out.println("long, int - widening");
		System.out.println("sum = " + (x+y));
	}

	
	static void add(Integer x, int y) {
		System.out.println("Integer, int - boxing");
		System.out.println("sum = " + (x+y));
	}
	
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		add(n1, n2);
	}

}
