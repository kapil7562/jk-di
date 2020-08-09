package com.springframework.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarService {

	@Autowired
	private List<Car> cars;
	
	public void printCarNames() {
		for(Car car : cars) {
			System.out.println(car.getName());
		}
	}
}
