package com.capgemini.boot.beans.cinfigurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.boot.utils.PasswordEncoder;

@Configuration
public class VehicleConfiguration {

	public VehicleConfiguration() {
		System.out.println("VehicleConfiguration :: Constructor");
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new PasswordEncoder();
	}
}
