package com.example.project.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/validate")
	public String validate(@RequestParam String username, 
				@RequestParam String password, Model model) {
		
		if(username.equals("admin") && password.equals("admin")) {
			model.addAttribute("username", username);
			return "success";
		}
		else
			return "fail";
		
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "login";
	}

}
