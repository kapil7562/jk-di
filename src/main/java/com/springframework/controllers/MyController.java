package com.springframework.controllers;

import org.springframework.stereotype.Controller;

import com.springframework.services.IGreetingService;

@Controller
public class MyController {
	
	private IGreetingService greetingService;
	
	
	
	public MyController(IGreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}



	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
