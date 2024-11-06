package com.capgemini.java.arrays;

public class Doubt {

	public static void main(String[] args) {
		String data = "625";
		int n = Integer.parseInt(data);
		System.out.println(n);
		
		data = "A"; //java.lang.NumberFormatException
		n = Integer.parseInt(data);
		System.out.println(n);

	}

}
