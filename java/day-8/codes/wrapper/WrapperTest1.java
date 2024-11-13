package com.capgemini.java.wrapper;

public class WrapperTest1 {

	public static void main(String[] args) {
		Integer n1 = new Integer(25);
		Integer n2 = new Integer("25");
		System.out.println(n1 + " | "  + n2);
		
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("false");
		System.out.println(b1 + " | "  + b2);		
		
		Character c1 = new Character('A');
		Character c2 = new Character('\u0041');
		System.out.println(c1 + " | "  + c2);
		
		Integer n3 = Integer.valueOf(26);
		Integer n4 = Integer.valueOf("26");
		System.out.println(n3 + " | "  + n4);
		System.out.println();
		
		/*
		Integer x1 = Integer.valueOf(127);
		Integer x2 = Integer.valueOf(127);
		System.out.println(x1 == x2);
		*/
		Integer x1 = Integer.valueOf(128);
		Integer x2 = Integer.valueOf(128);
		System.out.println(x1 == x2);
	}
}
