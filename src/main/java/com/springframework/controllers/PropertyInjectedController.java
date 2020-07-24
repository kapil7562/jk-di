package com.springframework.controllers;

import com.springframework.services.IGreetingService;

public class PropertyInjectedController {
	public IGreetingService greeting;
	
	public String getGreeting() {
		return greeting.sayGreeting();
	}
}
