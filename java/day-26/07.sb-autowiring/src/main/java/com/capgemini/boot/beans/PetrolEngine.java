package com.capgemini.boot.beans;

import java.util.Random;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PetrolEngine implements Engine {

	public PetrolEngine() {
		System.out.println("PetrolEngine :: Constructor");
	}

	@Override
	public boolean startEngine() {
		System.out.println("starting petrol engine.....");
		return new Random().nextBoolean();
	}

}
