package com.capgemini.java.oops;

class Empl{
	int empno;
	String name;
	public Empl() {
		super();		
	}
	public Empl(int empno, String name) {
		super();
		this.empno = empno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("inside finalize() method");
	}	
}

public class GarbageCollectorTest {

	public static void main(String[] args) {
		Empl emp1 = new Empl(101, "Sanjay");
		System.out.println(emp1);
		
		emp1 = null;
		
		Empl emp2 = new Empl(102, "Praveen");
		Empl emp3 = new Empl(103, "Shankar");
		System.out.println(emp2);
		System.out.println(emp3);
		
		emp2 = emp3;
		new Empl(104, "Clark");
		
		System.gc();
		System.out.println("--- done ---");
	}

}
