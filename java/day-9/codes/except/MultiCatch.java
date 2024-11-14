package com.capgemini.java.except;

public class MultiCatch {

	public static void main(String[] args) {
		int[] data = new int[] {10, 5};
		
		/*
		try {
			int res = data[0] / data[1];
			System.out.println("result = "  + res);
		}catch(ArithmeticException ex) {
			System.out.println(ex.toString());
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.toString());
		}
		*/
		try {
			int res = data[0] / data[1];
			System.out.println("result = "  + res);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.toString());
		}	
	}

}
