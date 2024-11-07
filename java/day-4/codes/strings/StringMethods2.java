package com.capgemini.java.strings;

public class StringMethods2 {

	public static void main(String[] args) {
		String str1 = new String("Capgemini");
		//String str2 = new String("Capgemini");
		String str2 = new String("capgemini");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.contentEquals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String s1 = "ABC";
		//String s2 = "ABC";
		//String s2 = "ADA";
		String s2 = "AAC";
		int n = s1.compareTo(s2);
		System.out.println(n);
		
		String str = "Java is a Programming Language";
		//String sub = str.substring(5);
		String sub = str.substring(5, 6);
		System.out.println(sub);
	}

}
