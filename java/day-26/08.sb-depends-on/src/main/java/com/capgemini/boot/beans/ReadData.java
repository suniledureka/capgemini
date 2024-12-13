package com.capgemini.boot.beans;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("writeData")
public class ReadData {

	public ReadData() {
		System.out.println("ReadData :: Constructor");
	}

}
