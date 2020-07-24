package com.springframework.test.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.springframework.controllers.ContructorInjectedController;
import com.springframework.services.PropertyGreetingService;

public class ConstructorInjectedControllerTest {
	
	private ContructorInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new ContructorInjectedController(new PropertyGreetingService());
	}
	
	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}
}
