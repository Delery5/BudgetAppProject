package com.budgetapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BudgetAppApplication {
	
	static Logger log = LoggerFactory.getLogger(BudgetAppApplication.class);

	public static void main(String[] args) {
		log.info("#### Invoked BudgetAppApplication.java(String())method");
		SpringApplication.run(BudgetAppApplication.class, args);
		log.info("#### Exited BudgetAppApplication.java(String())method");
	}

}
