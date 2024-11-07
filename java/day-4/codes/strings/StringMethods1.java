package com.capgemini.java.strings;

public class StringMethods1 {

	public static void main(String[] args) {
		String str = "Capgemini Limited";
		
		System.out.println("size = " + str.length());
		
		System.out.println("charAt(0) = " + str.charAt(0));
		System.out.println("charAt(16) = " + str.charAt(16));
		//System.out.println("charAt(17) = " + str.charAt(17)); //java.lang.StringIndexOutOfBoundsException
		
		System.out.println("indexOf(i) = " + str.indexOf("i"));
		System.out.println("indexOf(i) = " + str.indexOf("i", 7));
		System.out.println("lastIndexOf(i) = " + str.lastIndexOf("i"));
		System.out.println("indexOf(Limited) = " + str.indexOf("Limited"));
		System.out.println("indexOf(java) = " + str.indexOf("java")); // -1
		System.out.println();
		
		System.out.println(str.replace('i', '*'));
		System.out.println(str.replace("i", "?"));
		System.out.println(str.replaceAll("i", "&"));
		System.out.println(str);
		System.out.println();
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
	}

}
