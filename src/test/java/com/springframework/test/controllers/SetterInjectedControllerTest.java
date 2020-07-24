package com.springframework.test.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.springframework.controllers.SetterInjectedController;
import com.springframework.services.PropertyGreetingService;

public class SetterInjectedControllerTest {
	
	private SetterInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new SetterInjectedController();
		controller.setGreeting(new PropertyGreetingService());
	}
	
	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}
}
