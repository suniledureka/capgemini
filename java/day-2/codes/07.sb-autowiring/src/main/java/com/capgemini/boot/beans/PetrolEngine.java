package com.capgemini.boot.beans;

import java.util.Random;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PetrolEngine implements Engine {

	public boolean startEngine() {
		System.out.println("Starting PetrolEngine");
		return new Random().nextBoolean();
	}

}
