package com.capgemini.boot.beans.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.boot.utils.PasswordUtility;

@Configuration
public class VehicleConfiguration {

	public VehicleConfiguration() {
		System.out.println("VehicleConfiguration :: Constructor");
	}

	@Bean
	public PasswordUtility getPassswordUtility() {
		return new PasswordUtility();
	}
}
