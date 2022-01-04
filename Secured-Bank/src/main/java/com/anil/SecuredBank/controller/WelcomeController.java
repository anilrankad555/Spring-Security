package com.anil.SecuredBank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/")
	public String getWelcomeMessage() {
		return "Hi! welcome to Secured Banking!";
	}

}
