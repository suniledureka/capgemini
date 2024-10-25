package com.capgemini.java.operators;

public class TableGenerator {
	static void printTable(int n) {
		for(int i=1; i<=10; i++) {
			int p = n * i;
			System.out.printf("%2d x %2d = %2d\n", n, i, p);
		}
	}
}
