package com.capgemini.java.oops;

public class Person {
	String name;
	int age;
		
	public Person(String name, int age) {		
		this.name = name;
		this.age = age;
	}
	
	void printDeatils() {
		System.out.println(String.format("NAME : %-20s \nAGE: %3d" , name, age));
		System.out.println();
	}
	public static void main(String[] args) {
		//--creating two instances of Person type
		Person sanjay = new Person("Sanjay", 25);
		Person mark = new Person("Mark", 26);
		
		sanjay.printDeatils();
		mark.printDeatils();
	}


	
}
