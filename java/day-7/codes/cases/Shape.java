package com.capgemini.java.oops.cases;

public abstract class Shape {
	String color;

	public Shape(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	abstract public void area();
}
