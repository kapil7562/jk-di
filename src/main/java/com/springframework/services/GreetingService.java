package com.springframework.services;

public class GreetingService implements IGreetingService{

	@Override
	public String sayGreeting() {
		
		return "Hello Greetings!!!";
	}

}
