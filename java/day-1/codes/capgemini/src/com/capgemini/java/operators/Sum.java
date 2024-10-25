package com.capgemini.java.operators;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter first no: ");
		int fno = sc.nextInt();
		
		System.out.print("enter second no: ");
		int sno = sc.nextInt();
		
		int sum = fno + sno;
		
		System.out.println("Sum = " + sum);
		System.out.println(fno + " + " + sno + " = " + sum);
		System.out.printf("%d + %d = %d\n", fno, sno, sum);
		
		String result = String.format("%d + %d = %d", fno, sno, sum);
		System.out.println(result);
		sc.close();
	}

}
