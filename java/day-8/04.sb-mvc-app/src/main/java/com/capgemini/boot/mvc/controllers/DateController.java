package com.capgemini.boot.mvc.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DateController {
	
	@GetMapping(value = {"/today", "/date"})
	public String showTodaysDateAndTime(Model model) {
		LocalDateTime localDt = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String dt = formatter.format(localDt);
		model.addAttribute("date", dt);
		
		return "index";
	}
}
