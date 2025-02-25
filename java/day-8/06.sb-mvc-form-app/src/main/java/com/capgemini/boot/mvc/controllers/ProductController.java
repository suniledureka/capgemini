package com.capgemini.boot.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/pms")
public class ProductController {
	
	@GetMapping(path = {"", "/entry"})
	public String loadProductEntryPage() {
		return "index";
	}
	
	@PostMapping(path = "/save")
	public String handleSubmitButtonClick(HttpServletRequest request, Model model) {
		String pid = request.getParameter("pid");
		String name = request.getParameter("pname");
		String price = request.getParameter("pprice");
		
		model.addAttribute("message", "Product added to Stock");
		model.addAttribute("pid", pid);
		model.addAttribute("pname", name);
		model.addAttribute("pprice", price);
		
		return "success";
	}
}
