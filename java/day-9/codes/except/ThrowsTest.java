package com.capgemini.java.except;

public class ThrowsTest {

	public static void main(String[] args) throws InterruptedException {
		UserService uServ = new UserService();
		int uid = 100;
		
		try {
			String userName = uServ.getUserNameById(uid);
			System.out.println("Hello " + userName);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
		System.out.println("Please wait for 4 seconds...");
		
		Thread.sleep(4000); //4000ms - 4 seconds
		System.out.println("Thanks for waiting!!!");
	}

}
