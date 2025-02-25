package com.capgemini.boot.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingsController {
	
	@GetMapping(path = "/greet")
	public ModelAndView showWelcomeMessage() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("message", "Greeting from Capgemini!!!");
		mav.setViewName("index");
		
		return mav;
	}
}
