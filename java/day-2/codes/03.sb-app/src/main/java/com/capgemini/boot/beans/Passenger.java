package com.capgemini.boot.beans;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Passenger {
	private String passengerName;
	private String fromStation;
	private String toStation;
	private LocalDate doTravel;
}
