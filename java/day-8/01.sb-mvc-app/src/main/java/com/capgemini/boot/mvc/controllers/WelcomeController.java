package com.capgemini.boot.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@GetMapping(path = "/welcome")
	public ModelAndView showWelcomeMessage() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("message", "Welcome to Capgemni from Spring Boot MVC");
		mav.setViewName("index");
		
		return mav;
	}
}
