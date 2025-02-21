package com.capgemini.boot.rest.dto;

import java.time.LocalDate;

import com.capgemini.boot.rest.dto.adapter.LocalDateAdapter;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Ticket {
	private String passengerName;
	private String fromStation;
	private String toStation;
	
	@XmlJavaTypeAdapter(value = LocalDateAdapter.class)
	private LocalDate dateOfJourney;
	private String trainNo;
	
	private String pnr;
	
	@XmlJavaTypeAdapter(value = LocalDateAdapter.class)
	private LocalDate dateOfBooking;
	private String bookingStatus;
	private Integer ticketFare;
}
