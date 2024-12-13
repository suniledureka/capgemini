package com.capgemini.boot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private Engine engine;
	
	public Car() {}
	
	@Autowired
	public Car(Engine engine) {
		System.out.println("Car :: arg Constructor");
		this.engine = engine;
	}


	public void startJourney() {
		System.out.println("starting journey...");
		boolean engineStatus = engine.startEngine();
		
		if(engineStatus)
			System.out.println("###--- HAPPY JOURNEY ---####");
		else
			System.err.println("@@@--- JOURNEY CANCELLED ---@@@");
	}	
}
