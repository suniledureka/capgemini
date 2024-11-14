package com.capgemini.java.except;

import java.io.Closeable;
import java.io.IOException;

class MyResource1 implements Closeable{
	public void logic() {
		System.out.println("business logic of MyResource-1");
	}
	
	@Override
	public void close() throws IOException {
		System.out.println("closing MyResource-1");		
	}	
}

class MyResource2 implements AutoCloseable{
	public void logic() {
		System.out.println("business logic of MyResource-2");
	}
	
	@Override
	public void close() throws IOException {
		System.out.println("closing MyResource-2");		
	}	
}

public class ResourceTest1 {

	public static void main(String[] args) throws Exception {
		System.out.println("main method starts");
		try(MyResource2 res2 = new MyResource2(); MyResource1 res1 = new MyResource1()) {
			res1.logic();	
			res2.logic();
			System.out.println("end of try");
		}
		System.out.println("out of try");
	}

}
