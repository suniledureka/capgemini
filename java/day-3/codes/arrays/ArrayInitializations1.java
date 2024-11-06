package com.capgemini.java.arrays;

import java.util.Arrays;

public class ArrayInitializations1 {

	public static void main(String[] args) {
		int[][] n = {{1,2,3}, {4,5}, {6,7,8,9}};
		
		System.out.println(n);
		System.out.println();
		
		System.out.println("size of array = " + n.length + "\n");
		
		for(int i=0; i<n.length; i++) {
			System.out.println("size of n[" + i + "] = " + n[i].length);
		}
		System.out.println();
		
		/*-- array iteration in a matrix form --*/
		for(int i=0; i<n.length; i++) {
			//System.out.println(Arrays.toString(n[i]));
			for(int j=0; j<n[i].length; j++) {
				System.out.print(n[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		/*-- array iteration in a matrix form using enhanced for loop--*/
		for(int[] x: n) {
			for(int y : x) {
				System.out.print(y + "\t");
			}
			System.out.println();
		}
	}

}
