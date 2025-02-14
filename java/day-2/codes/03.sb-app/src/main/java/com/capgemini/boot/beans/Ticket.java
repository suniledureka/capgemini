package com.capgemini.boot.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ticket {
	@Value("ABC3456Y")
	private String pnr;
	
	@Value("${psgrName}")
	private String passengerName;

	@Override
	public String toString() {
		return "Ticket [pnr= " + pnr + " |  Name= " + passengerName + "]";
	}

}
