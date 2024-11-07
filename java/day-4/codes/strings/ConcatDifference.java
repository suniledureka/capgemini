package com.capgemini.java.strings;

public class ConcatDifference {

	public static void main(String[] args) {
		String str1 = "Capgem";
		String str2 = str1.concat("");
		System.out.println(str2);
		System.out.println(str1 == str2);
		
		String str3 = "Capgem";
		String str4 = str3 + "";
		System.out.println(str3==str4);
	}

}
