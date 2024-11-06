package com.capgemini.java.arrays;
import java.util.Scanner;

public class ReportCard1 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("enter student name: ");
		String name = sc.nextLine();
		
		System.out.print("enter no of subjects: ");
		
		int noOfSubjects = sc.nextInt();
		String[] subjectNames = new String[noOfSubjects];
		int[] marks = new int[noOfSubjects];
		
		subjectNamesEntry(subjectNames);
		marksEntry(subjectNames, marks);
		printReportCard(name, marks, subjectNames);
	}

	private static void subjectNamesEntry(String[] subjectNames) {
		for(int i=0; i<subjectNames.length; i++) {
			System.out.print("enter subject name-" + (i+1) +": ");
			subjectNames[i] = sc.next();
		}
		System.out.println();
	}

	private static void marksEntry(String[] subNames, int[] marks) {
		for(int i=0; i<marks.length; i++) {
			System.out.print("enter mark for \""+ subNames[i]+"\" : ");
			marks[i] = sc.nextInt();
		}		
	}

	private static void printReportCard(String name, int[] marks, String[] subNames) {
		System.out.println();
		System.out.println("-".repeat(40));
		System.out.println("\t\t REPORT CARD");
		
		System.out.println("NAME: " + name);
		System.out.println("-".repeat(40));
		
		System.out.println(" SUBJECT \t MARKS");
		System.out.println("-".repeat(40));
		
		int total = 0;
		
		for(int i=0; i<marks.length; i++) {
			System.out.printf("%-10s \t %3d\n",subNames[i], marks[i]);
			total += marks[i];
		}
		System.out.println("-".repeat(40));
		
		float avg = (float)total / marks.length;
		System.out.printf("TOTAL: %d \t AVERAGE: %.2f\n", total, avg);
		System.out.println("-".repeat(40));
	}	
}
