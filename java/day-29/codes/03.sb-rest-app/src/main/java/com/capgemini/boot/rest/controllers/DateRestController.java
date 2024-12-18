package com.capgemini.boot.rest.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateRestController {
	
	@GetMapping(value = {"/date", "/today"})
	public ResponseEntity<String> generateTodaysDate() {
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
		String responseData = ldt.format(formatter);
		
		//ResponseEntity<String> responseEntity = new ResponseEntity<String>(HttpStatus.CREATED);
		//ResponseEntity<String> responseEntity = new ResponseEntity<String>(responseData, HttpStatus.OK);
		//ResponseEntity<String> responseEntity = new ResponseEntity<String>(responseData, HttpStatus.BAD_REQUEST);
		
		//----- include response headers ----
		HttpHeaders respHeaders = new HttpHeaders();
		
		respHeaders.add("company", "Capgemini");
		respHeaders.add("location", "Hyderabad");
		respHeaders.add("contact", "Prudhvi");
		
		ResponseEntity<String> responseEntity = new ResponseEntity<String>(responseData, respHeaders, HttpStatus.OK);
		return responseEntity;
	}
}
