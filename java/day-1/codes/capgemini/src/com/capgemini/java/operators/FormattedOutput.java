package com.capgemini.java.operators;

public class FormattedOutput {

	public static void main(String[] args) {
		float sal = 8547.46482f;
		System.out.println(sal);
		
		System.out.printf("%f \n", sal);
		System.out.printf("%.0f \n", sal);
		
		System.out.printf("%.1f \n", sal);
		System.out.printf("%.2f \n", sal);
		System.out.printf("%.3f \n", sal);
		System.out.println();
		
		int eno = 101;
		String name = "Sandeep Patil";
		
		System.out.printf("%-6d  %-15s  %.2f\n", eno, name, sal);
		
		int eno1 = 100234;
		String name1 = "Sooraj";
		float sal1 = 5875.45f;
		System.out.printf("%-6d  %-15s  %.2f", eno1, name1, sal1);
	}

}
