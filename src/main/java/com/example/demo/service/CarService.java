package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.Car;

public interface CarService {

	public Optional<Car> gatCarByModelAndConcept();
	
}
