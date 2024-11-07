package com.capgemini.java.strings;

public class StringCreations {

	public static void main(String[] args) {
		String s1 = "Capgemini";
		String s2 = "Capgemini";		
		System.out.println(s1 == s2); //true
		
		String s3 = new String("java");
		String s4 = new String("java");
		System.out.println(s3 == s4); // false
		
		//s1.concat(" limited");
		s1 = s1.concat(" limited");
		System.out.println(s1);
		System.out.println();
	}
}
