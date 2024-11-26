package com.capgemini.java.threads;

public class ThreadWithLambda {

	public static void main(String[] args) {
		int noOfThreads = Thread.activeCount();
		System.out.println("no of active threads = " + noOfThreads);
		
		Thread t = Thread.currentThread();
		System.out.println("thread in main() = " + t.getName().toUpperCase());
		
		/*
		//---using anonymous class concept
		Thread ct = new Thread(new Runnable() {
			public void run() {
				Thread t = Thread.currentThread();
				System.out.println("thread in run() = " + t.getName().toUpperCase());				
			}
		});
		*/
		Thread ct = new Thread(() -> {
				System.out.println("thread in run() = " + Thread.currentThread().getName().toUpperCase());				
			});		
		
		ct.start();
		
		System.out.println("no of active threads = " + Thread.activeCount());

	}

}
