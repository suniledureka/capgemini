package com.capgemini.java.arrays;

public class JaggedArray {

	public static void main(String[] args) {
		int[][] classX = new int[3][];
		System.out.println(classX);
		System.out.println(classX.length);
		//System.out.println(classX[0].length); //java.lang.NullPointerException
		
		classX[0] = new int[10];
		classX[1] = new int[8];
		classX[2] = new int[7];
		
		for(int i=0; i<classX.length; i++) {
			System.out.println("no of students in Class[" + i + "] = " + classX[i].length);
		}
		System.out.println();	
		
		System.err.println("cannot continue with your inputs");
		System.out.println("-".repeat(100));
	}

}
