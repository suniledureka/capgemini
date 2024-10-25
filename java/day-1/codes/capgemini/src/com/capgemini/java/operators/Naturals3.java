package com.capgemini.java.operators;

public class Naturals3 {

	public static void main(String[] args) {
		printNaturals(); //method call
		printNaturals(); //method call
		printNaturals(); //method call
	}
	
	/*--- method definition to print 10 naturals ---*/
	private static void printNaturals() {
		System.out.println("First 10 Natural Numbers are:");
		int n = 1;
		while(n < 11) {
			if(n == 10) {
				System.out.println(n);
			}else {
				System.out.print(n + ", ");
			}
			n++;
		}
		System.out.println("\n");
	}

}
