package com.capgemini.boot.rest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cibil")
public class CibilRestController {
	
	//@GetMapping("/score/{name}/{pan}")
	@GetMapping("/{name}/score/{pan}")
	public ResponseEntity<?> getCibilScore(@PathVariable String name,
										   @PathVariable String pan){
		if(pan != null && pan.length() == 10) {
			//logic to get the cibil score from data store
			String responseText = String.format("Hello %s , your CIBIL Score is 788", name);
			return ResponseEntity.ok().body(responseText);
		}else {
			return ResponseEntity.badRequest().build();
		}
	}
}
