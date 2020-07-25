package com.springframework.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springframework.services.IGreetingService;

@Controller
public class I18NController {
	private IGreetingService greetingService;
	
	
	
	public I18NController(@Qualifier("i18nService") IGreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}



	public String sayGreeting() {
		return greetingService.sayGreeting();
	}
}
