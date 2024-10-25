package com.capgemini.java.operators;

public class TernaryOperator1 {

	public static void main(String[] args) {
		int x = 212;
		int y = 123;
		int z = 34;
		
		int lar = (x > y) ? (x > z) ? x : z : (y > z) ? y : z;
		
		System.out.printf("largest of (%d, %d, %d) = %d", x, y, z, lar);

	}

}
