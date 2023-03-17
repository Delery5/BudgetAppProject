package com.budgetapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/")
public class 	LoginController {
	
	static Logger log = LoggerFactory.getLogger(LoginController.class);

	@GetMapping("/users")
	public String getUser(){
		
		log.info("#### Invoked LoginController.java #getUser()method");
		return "Delery User Controller Works!";
	}
}