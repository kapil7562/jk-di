package com.springframework.test.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.springframework.controllers.PropertyInjectedController;
import com.springframework.services.PropertyGreetingService;

public class PropertyInjectedControllerTest {
	
	private PropertyInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();
		controller.greeting = new PropertyGreetingService();
	}
	
	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}
}
