package com.capgemini.java.operators;

public class Largest {

	public static void main(String[] args) {
		int x = 25;
		int y = 54;
		int z = 36;
		
		int lar = (x > y) ? (x > z) ? x : z : (y > z) ? y : z;
		
		System.out.printf("largest of (%d, %d, %d) = %d", x, y, z, lar);
	}
}
