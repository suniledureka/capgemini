package com.capgemini.boot.utils;

import java.util.Base64;

public class PasswordEncoder {
	
	public PasswordEncoder() {
		System.out.println("PasswordEncoder :: Constructor");
	}

	public String encodeData(String pass) {
		Base64.Encoder encoder = Base64.getEncoder();
		String encodePass = encoder.encodeToString(pass.getBytes());
		return encodePass;
	}
}
