package com.capgemini.java.strings;

public class StringMethods5 {

	public static void main(String[] args) {
		String s1 = "ABC";
		//String s2 = new String("ABC");
		String s2 = new String("ABC").intern();
		
		System.out.println(s1 == s2);

	}

}
