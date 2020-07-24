package com.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ContructorGreetingService implements IGreetingService{

	@Override
	public String sayGreeting() {
		
		return "Hello Greetings - Construtor";
	}

}
