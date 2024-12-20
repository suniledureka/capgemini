package com.capgemini.boot.rest.dto;

import java.time.LocalDate;

import com.capgemini.boot.rest.dto.adapter.LocalDateAdapter;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
@Schema(name = "Passenger", description = "Schema to hold passenger information")
public class Passenger {
	//@NotNull
	@NotNull(message = "required")
	//@NotEmpty(message = "should not be empty")
	@NotBlank(message = "should not be empty")
	@Schema(description = "Name of the passenger", example = "Sunil Joseph" )
	private String passengerName;
	
	@NotNull(message = "required")
	@NotBlank(message = "fromStation should not be blank")
	@Size(min = 3, message = "should be min 3 char length")
	@Schema(description = "fromStation of travel, min 3 chars", example = "Hyderabad" )
	private String fromStation;
	
	@Size(min = 3, message = "should be min 3 char length")
	private String toStation;
	
	@NotNull
	@XmlJavaTypeAdapter(value = LocalDateAdapter.class)
	@Future(message = "travel date should be after ")
	private LocalDate dateOfJourney;
	
	@NotNull
	@Size(min = 4, max = 6, message = "trainNo should be b/w 4 to 6 chars")
	private String trainNo;
}
