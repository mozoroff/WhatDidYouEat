package com.mozoroff.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController {
	
	@GetMapping("/signup")
	public String getSignup() {
		return "signup";
	}
	
	@PostMapping("/signup")
	public String signupPost() {
		return "redirect:top/login";
	}
}
