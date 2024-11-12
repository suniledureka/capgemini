package com.capgemini.java.oops.cases;

public class Rectangle extends Shape {
	int length, breadth;
	
	public Rectangle(String color, int length, int breadth) {
		super(color);
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public void area() {
		System.out.println("area of Rectangle = " + (this.length * this.breadth));
	}

}
