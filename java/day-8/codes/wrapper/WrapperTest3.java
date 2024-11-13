package com.capgemini.java.wrapper;

public class WrapperTest3 {

	public static void main(String[] args) {
		int n1 = 25;
		Integer n2 = n1; //auto-boxing
		int n3 = n2; //auto-unboxing
		
		System.out.println(n1 + " | " + n2 + " | " + n3);
		
		Integer x1 = 12;
		Integer x2 = 23;
		Integer x3 = x1 + x2; //un-boxing, add, boxing
		System.out.println(x3);
	}
}
