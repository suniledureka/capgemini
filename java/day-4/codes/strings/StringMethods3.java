package com.capgemini.java.strings;

public class StringMethods3 {

	public static void main(String[] args) {
		String str = "Java is a Programming Language";
		String[] words = str.split(" ");
		System.out.println("no of words = " + words.length);
		
		System.out.println("====== WORDS =====");
		for(String word : words) {
			System.out.println("---> " + word);
		}
		System.out.println();
		
		String str1 = String.join(" * ", words);
		System.out.println(str1);
		System.out.println();
		
		
		str = "Java  is  a  Programming  Language";
		String[] words1 = str.split("[ ]+");
		System.out.println("no of words = " + words1.length);
		
		System.out.println("====== WORDS =====");
		for(String word : words1) {
			System.out.println("---> " + word);
		}
		
		System.out.println("=".repeat(100));
		str = "word,word*word% word@   java python%";
		String[] words2 = str.split("[,*% @]+");
		System.out.println("no of words = " + words2.length);
		
		for(String word : words2) {
			System.out.println("---> " + word);
		}
		
		int empno = 101;
		String name = "Sanjay";
		float sal = 2500.75f;
		
		String employee = String.format("%5d %10s %.2f" , empno, name, sal);
		System.out.println(employee);
		
		String phone = "7848586879";
		boolean isPhoneValid = phone.matches("[6789][0-9]{9}");
		System.out.println(isPhoneValid);
	}

}
