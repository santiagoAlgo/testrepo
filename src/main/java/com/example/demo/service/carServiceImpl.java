package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Car;
import com.example.demo.repo.CarRepository;

@Service
public class carServiceImpl implements CarService{

	@Autowired
	CarRepository carRepo;
	
	@Override
	public Optional<Car> gatCarByModelAndConcept() {
		
		List<Car> cars = carRepo.findByCarModelAndConcept("Civic", "Sports");
		
		Car car = cars.get(0);
		
		Optional<Car> optionalOfCar = Optional.ofNullable(car);
		
		
		return optionalOfCar;
	}

}
