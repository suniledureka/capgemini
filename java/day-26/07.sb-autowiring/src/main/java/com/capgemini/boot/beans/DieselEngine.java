package com.capgemini.boot.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine {

	public DieselEngine() {
		System.out.println("DieselEngine :: Constructor");
	}

	@Override
	public boolean startEngine() {
		System.out.println("starting diesel engine.....");
		return new Random().nextBoolean();
	}

}
