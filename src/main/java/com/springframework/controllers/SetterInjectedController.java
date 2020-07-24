package com.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springframework.services.IGreetingService;

@Controller
public class SetterInjectedController {

	private IGreetingService greeting;

	@Qualifier("setterGreetingService")
	@Autowired
	public void setGreeting(IGreetingService greeting) {
		this.greeting = greeting;
	}
	
	public String getGreeting() {
		return greeting.sayGreeting();
	}
}
