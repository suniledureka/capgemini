package com.capgemini.java.arrays;

import java.util.Arrays;

public class ArrayCreations {

	public static void main(String[] args) {
		int[] marks = new int[10];
		marks[0] = 98;
		marks[1] = 85;
		System.out.println("size of array = " + marks.length);
		System.out.println(Arrays.toString(marks));
		System.out.println();
		
		double []salaries = new double[9];
		System.out.println(Arrays.toString(salaries));
		
		char alphabets[] = new char[10];
		System.out.println(Arrays.toString(alphabets));
		
		boolean[] status = new boolean[20];
		System.out.println(Arrays.toString(status));
		
		String[] names = new String[10];
		System.out.println(Arrays.toString(names));
		
		for(String name : names) {
			System.out.println(name);
		}
	}

}
