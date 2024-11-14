package com.capgemini.java.except;

import java.sql.SQLException;

class A{
	void display() {}
}

class B extends A{

	@Override
	void display() throws ArithmeticException {
	}
	
}

public class ThrowsTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
