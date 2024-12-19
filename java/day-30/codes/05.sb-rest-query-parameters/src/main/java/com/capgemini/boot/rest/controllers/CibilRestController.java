package com.capgemini.boot.rest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cibil")
public class CibilRestController {
	@GetMapping("/score")
	public ResponseEntity<String> findCibilScore(@RequestParam String cname,
												 @RequestParam(name = "pan", required = false) String pan){
		
		String response = "Hello, " + cname +", please provide a valid PAN";
		
		if(pan != null && pan.length() ==10) {
			//logic to fetch CIBIL score from data store
			response = String.format("Hello %s, your CIBIL Score is 799", cname);
			//return new ResponseEntity<String>(response, HttpStatus.OK);
			//return ResponseEntity.ok(response);
			return ResponseEntity.ok().body(response);
		}else {
			//return new ResponseEntity<String>(response, HttpStatus.BAD_REQUEST);
			return ResponseEntity.badRequest().body(response);
		}
		
	}
}
