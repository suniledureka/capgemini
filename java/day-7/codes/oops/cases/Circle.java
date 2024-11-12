package com.capgemini.java.oops.cases;

public class Circle extends Shape {
	float radius;
	
	public Circle(String color, float radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.printf("area of Circle = %.2f \n" + (Math.PI * Math.pow(radius, 2)));
	}

}
