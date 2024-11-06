package com.capgemini.java.arrays;

public class VarArgsTest {

	public static void main(String[] args) {
		sum();
		byte b = 10;
		sum(b);
		sum(12,23);
		sum(23,45,20);
	}
	
	static void sum(int... args) {
		System.out.println("no of arguments = " + args.length);
		int sum = 0;
		for(int x : args) {
			sum += x;
		}
		System.out.println("sum = " + sum);
		System.out.println("-".repeat(100));
	}
}
