package com.capgemini.java.oops;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Student st = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter student's Id: ");
		int sid = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter student's Name: ");
		String sname = sc.nextLine();
		
		System.out.print("Enter Student's address: ");
		String saddress = sc.nextLine();
		String isFromNIT, collegeName;
		
		do {
			System.out.print("Whether the student is from NIT(Yes/No): ");	
			isFromNIT = sc.next();
			sc.nextLine();	
			if(!(isFromNIT.equalsIgnoreCase("YES") || isFromNIT.equalsIgnoreCase("NO")))
				System.err.println("Wrong Input");
		}
		while(!(isFromNIT.equalsIgnoreCase("YES") || isFromNIT.equalsIgnoreCase("NO")));
		
		if(isFromNIT.equalsIgnoreCase("NO")) {
			System.out.print("Enter the college name: ");
			collegeName = sc.nextLine();
			st = new Student(sid, sname, saddress, collegeName);
		}else {
			st = new Student(sid, sname, saddress);
		}
		
		st.displayDetails();
		
		sc.close();
	}

	

}
