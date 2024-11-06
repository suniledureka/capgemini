package com.capgemini.java.arrays;

public class Sum {

	public static void main(String[] args) {
		if(args.length >= 2) {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int s = x + y;
			System.out.printf("%d + %d = %d ", x, y, s);
		}else {
			System.err.println("insufficient data!!!");
		}

	}

}
