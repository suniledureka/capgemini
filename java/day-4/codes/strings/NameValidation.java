package com.capgemini.java.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NameValidation {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("enter your name: ");
		String name = br.readLine();
		
		String pattern = "^[A-z ]+$";
		boolean isValidName = name.matches(pattern);
		if(isValidName)
			System.out.println("Hello " + name);
		else
			System.err.println("no a valid name");
		
		System.out.print("enter age: ");
		String ageStr = br.readLine();
		pattern = "[0-9]{1,3}";
		if(ageStr.matches(pattern)) {
			int age = Integer.parseInt(ageStr);
			System.out.println(age);
		}else {
			System.err.println("age is not valid");
		}
		br.close();
	}

}
