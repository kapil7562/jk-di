package com.springframework.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springframework.services.IGreetingService;

@Controller
public class ContructorInjectedController {
	
	private final IGreetingService greeting;
	
	public ContructorInjectedController(@Qualifier("contructorGreetingService") IGreetingService greeting) {
		this.greeting = greeting;
	}
	
	public String getGreeting() {
		return greeting.sayGreeting();
	}
}
