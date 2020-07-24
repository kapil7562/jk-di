package com.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springframework.services.IGreetingService;

@Controller
public class PropertyInjectedController {
	
	@Qualifier("propertyGreetingService")
	@Autowired
	public IGreetingService greeting;
	
	public String getGreeting() {
		return greeting.sayGreeting();
	}
}
