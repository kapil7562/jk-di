package com.springframework.controllers;

import com.springframework.services.IGreetingService;

public class ContructorInjectedController {
	
	private final IGreetingService greeting;
	
	public ContructorInjectedController(IGreetingService greeting) {
		this.greeting = greeting;
	}
	
	public String getGreeting() {
		return greeting.sayGreeting();
	}
}
