package com.capgemini.java.oops.cases;

import java.util.Scanner;

public class SMS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] students = new Student[10];
		String req = "Y";
		int i = 0;
		do {
			System.out.print("enter student name: ");
			String name = sc.nextLine();
			
			Student st = new Student(name);
			students[i] = st;
			i++;
			
			System.out.print("do you want to add more students? [Y/N]: ");
			req = sc.nextLine();
		}while(req.equalsIgnoreCase("Y"));
		
		printStudents(students, i);
		
		sc.close();
	}

	private static void printStudents(Student[] students, int noOfStudents) {
		System.out.println("\n ======= CALGEMINI COLLEGE OF ENGINEERING =======\n");
		for(int i=0; i<noOfStudents; i++) {
			System.out.println(students[i]);
		}
	}

}
