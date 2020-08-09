package com.springframework.services;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Toyota implements Car{

	@Override
	public String getName() {
		return "Toyota";
	}

}
