package com.capgemini.java.oops.cases;

import java.util.Scanner;

public class DrawingApp {

	public static void main(String[] args) {
		System.out.println(22d / 7);
		Shape sh;
		//sh = new Shape(); //Cannot instantiate the type Shape
		Scanner sc = new Scanner(System.in);
		
		System.out.print("which shape do you want to use with? [1. Rect | 2. Circle]: ");
		int shapeType = sc.nextInt();
		
		switch(shapeType) {
		 case 1:
			System.out.print("enter color of Rectangle: ");
			String color = sc.next();
			System.out.print("enter length of Rectangle: ");
			int len = sc.nextInt();
			System.out.print("enter breadth of Rectangle: ");
			int bre = sc.nextInt();
			
			sh = new Rectangle(color, len, bre);
			break;
		 case 2:
			System.out.print("enter color of Circle: ");
			color = sc.next();
			System.out.print("enter radius of Circle: ");
			float radius = sc.nextFloat(); 
			
			sh = new Circle(color, radius);
			break;
		 default:
			System.err.println("Invalid Shape Selection");
			return;
		}//switch
		
		System.out.println("\n============== SHAPE SELECTED: " + sh.getClass().getSimpleName().toUpperCase()+" ==============");
		
		System.out.println("color of \""+ sh.getClass().getSimpleName()+"\" = " + sh.getColor());
		
		System.out.print("do you want to change the color of \"" + sh.getClass().getSimpleName() +"\"? [Y/N]: ");
		String choice = sc.next();
		
		if(choice.equalsIgnoreCase("Y")) {
			System.out.print("enter new color \"" + sh.getClass().getSimpleName()+"\": ");
			String newColor = sc.next();
			sh.setColor(newColor);
			System.out.println("modified color of \""+ sh.getClass().getSimpleName()+"\" = " + 
																				sh.getColor());
		}
		System.out.println();
		
		sh.area();		
		sc.close();
	}
}
