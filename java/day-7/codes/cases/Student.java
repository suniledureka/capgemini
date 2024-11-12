package com.capgemini.java.oops.cases;

public class Student {
	private String studentId;
	private String studentName;
	static int sid=1001;
	
	public Student(String studentName) {
		super();
		this.studentId = "CCE_"+ getId();		
		this.studentName = studentName;
	}

	private int getId() {
		return sid++;
	}

	@Override
	public String toString() {
		String stud = String.format("%-10s    %-20s", this.studentId, this.studentName);
		return stud;
	}
}
