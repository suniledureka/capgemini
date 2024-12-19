package com.capgemini.boot.rest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProcessRequestDataRestController {
	
	@PostMapping("/data")
	public ResponseEntity<?> processRequestHeadersAndData(@RequestHeader("Host") String host, 
														  @RequestHeader(value = "company", required = false, defaultValue = "CapGem") String company, 
														  @RequestBody String requestData){
		String response = "Host: " + host;
		response += "\nCompany: " + company;
		response += "\nRequest Data: " + requestData;
		
		return ResponseEntity.ok(response);
	}
}
