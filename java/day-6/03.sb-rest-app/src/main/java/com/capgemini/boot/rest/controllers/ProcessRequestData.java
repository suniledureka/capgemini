package com.capgemini.boot.rest.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProcessRequestData {
	
	@PostMapping("/data")
	public ResponseEntity<?> processRequestHeaderAndData(@RequestHeader("Host") String host,
														 @RequestHeader(value = "company", required = false, defaultValue = "NA") String compName,
														 @RequestBody(required = false) String requestData){
		//return String
		Map<String, String> data = new HashMap<String, String>();
		
		data.put("server", host);
		data.put("company", compName);
		data.put("requestData", requestData);
		
		return ResponseEntity.ok().body(data);
	}
}
