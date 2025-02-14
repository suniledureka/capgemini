package com.capgemini.boot.utils;

import java.util.Base64;

public class PasswordUtility {
	
	public PasswordUtility() {
		System.out.println("PasswordUtility :: Constructor");
	}
	
	public String encodePassword(String pass) {
		Base64.Encoder encoder = Base64.getEncoder();
		String encodedPass = encoder.encodeToString(pass.getBytes());
		return encodedPass;
	}
}
