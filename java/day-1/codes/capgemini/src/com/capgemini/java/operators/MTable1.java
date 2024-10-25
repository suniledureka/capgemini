package com.capgemini.java.operators;

import java.util.Scanner;

public class MTable1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("which numbers' multiplication table? ");
		int num = sc.nextInt();
		
		TableGenerator.printTable(num);
	}



}
