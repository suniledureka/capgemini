package com.capgemini.boot.rest.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DateTimeRestController {
	
	@GetMapping(path = {"/today", "/date"})
	public ResponseEntity<String> showTodaysDateAndTime() {
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
		
		String dt = formatter.format(dateTime);
		
		//ResponseEntity<String> responseEntity = new ResponseEntity<String>(HttpStatus.OK);
		//ResponseEntity<String> responseEntity = new ResponseEntity<String>(dt, HttpStatus.OK);
		//ResponseEntity<String> responseEntity = new ResponseEntity<String>(dt, HttpStatus.BAD_REQUEST);
		
		//--- including HTTP Response Headers ---
		HttpHeaders responseHeaders = new HttpHeaders();
		
		responseHeaders.add("company", "Capgemini");
		responseHeaders.add("location", "Chennai");
		responseHeaders.add("contact", "Shivani");
		
		//ResponseEntity<String> responseEntity = new ResponseEntity<String>(dt, responseHeaders, HttpStatus.OK);
		
		//ResponseEntity<String> responseEntity = ResponseEntity.ok(dt);
		ResponseEntity<String> responseEntity = ResponseEntity.ok().body(dt);

		return responseEntity;
	}
}
