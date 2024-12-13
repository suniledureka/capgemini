package com.capgemini.boot.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Ticket {
	@Value("TRD345R")
	private String pnr;
	
	@Value("${cap.pngrname}")
	private String passengerName;
	
	@Override
	public String toString() {
		return "Ticket [pnr=" + pnr + ", passengerName=" + passengerName + "]";
	}
	
	
}
