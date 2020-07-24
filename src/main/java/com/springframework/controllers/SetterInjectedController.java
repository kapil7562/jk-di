package com.springframework.controllers;

import com.springframework.services.IGreetingService;

public class SetterInjectedController {

	private IGreetingService greeting;

	public void setGreeting(IGreetingService greeting) {
		this.greeting = greeting;
	}
	
	public String getGreeting() {
		return greeting.sayGreeting();
	}
}
