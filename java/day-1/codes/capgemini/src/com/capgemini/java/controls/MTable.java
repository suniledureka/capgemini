package com.capgemini.java.controls;

import java.util.Scanner;

public class MTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("which number's multiplication table? ");
		int num = sc.nextInt();
		
		printTable(num);
	}

	private static void printTable(int n) {
		for(int i=1; i<=10; i++) {
			int p = n * i;
			System.out.printf("%d x %2d = %2d \n", n, i, p);
		}
		
	}

}
