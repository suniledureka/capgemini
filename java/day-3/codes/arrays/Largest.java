package com.capgemini.java.arrays;

import java.util.Arrays;

public class Largest {

	public static void main(String[] args) {
		findLargest();
		findLargest(10,20);
		findLargest(25,60,78, 79.1, 34.5f);
		findLargest(-10, -20);
	}
	
	static void findLargest(double... data) {
		if(data.length == 0) {
			System.err.println("insufficient data passed");
			return;
		}
		//double lar = 0;
		double lar = data[0];
		for(int i=0; i<data.length; i++) {
			if(data[i] > lar) {
				lar = data[i];
			}
		}
		
		System.out.println("largest of "+ Arrays.toString(data) + " = " + lar);
	}
}
