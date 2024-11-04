package com.capgemini.java.operators;

public class ConditionalOperator {

	public static void main(String[] args) {
		int x = 56;
		int y = 45;
		
		int lar;
		
		/*
		if(x > y) {
			lar = x;
		}else {
			lar = y;
		}
		*/
		lar = (x > y) ? x : y; 
				
		System.out.printf("largest of (%d, %d) = %d", x, y, lar);
	}

}
