package com.budgetapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/")
public class 	LoginController {

	@GetMapping("/users")
	public String getUser(){
		
		return "Delery User Controller Works!";
	}
}