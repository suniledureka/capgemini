package com.capgemini.boot.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine {
	
	public boolean startEngine() {
		System.out.println("Starting DieselEngine");
		return new Random().nextBoolean();
	}

}
