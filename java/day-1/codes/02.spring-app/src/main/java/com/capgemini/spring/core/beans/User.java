package com.capgemini.spring.core.beans;

public class User {
	private String firstName;
	private String lastName;

	public User() {
		System.out.println("inside no args constructor");
	}

	public User(String firstName, String lastName) {
		System.out.println("inside 2 args constructor");
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		System.out.println("inside getFirstName()");
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("inside setFirstName()");
		this.firstName = firstName;
	}

	public String getLastName() {
		System.out.println("inside getLastName()");
		return lastName;
	}

	public void setLastName(String lastName) {
		System.out.println("inside setLastName()");
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("User [ %-20s  %-20s]", firstName, lastName);
	}
	
}
