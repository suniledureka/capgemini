package com.capgemini.java.threads;

class MyTask2 extends Thread {
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("thread in run() = " + t.getName().toUpperCase());
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		int noOfThreads = Thread.activeCount();
		System.out.println("no of active threads = " + noOfThreads);
		
		Thread t = Thread.currentThread();
		System.out.println("thread in main() = " + t.getName().toUpperCase());
		
		MyTask2 ct = new MyTask2();
		ct.start();
		
		System.out.println("no of active threads = " + Thread.activeCount());
	}
}
