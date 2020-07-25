package com.springframework.controllers;

import org.springframework.stereotype.Controller;

import com.springframework.services.PrimaryGreetingService;

@Controller
public class MyController {
	
	private PrimaryGreetingService greetingService;
	
	
	
	public MyController(PrimaryGreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}



	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
