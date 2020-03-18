package com.example.demo.controller;

import java.util.List;
import java.util.function.Supplier;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.repo.CarRepository;
import com.example.demo.service.CarService;

@RestController
public class CarController {
	
	@Autowired
	CarRepository carRepo;
	
	@Autowired
	CarService carService;
	
	@PostMapping("/fillcars")
	public String fillTable(@RequestBody List<Car> inCars) {
		
		inCars.stream().forEach(car -> {
			if(!car.getCarModel().startsWith("M")) {
				carRepo.save(car);
			}
			});
		carRepo.flush();
		return "ok";
	}

	@GetMapping("/hi2")
	public Car getCar(@RequestParam String model) {	
		Car queryCar = new Car(model);
		
		//List<Car> carsResult = carRepo.findCivic();
		//List<Car> carsResult = carRepo.findByCarModel("thatone");
		//List<Car> carsResult = carRepo.findByNameEndsWith("ijiji");
		//List<Car> carsResult = carRepo.findcarByModelConcept("civic", "Family");
		List<Car> carsResult = carRepo.findByCarModelAndConcept("Civic", "Sports");
		
		//List<Car> checknullable = carRepo.findByCarModelAndConcept("Civic", "Family");
		
		//Car resultCar2 = carService.gatCarByModelAndConcept().orElseGet((Supplier<? extends Car>) carRepo.findByCarModel("thatone"));
		
		//return carsResult.get(0);
		return carsResult.get(0);
		
	}
	
	private Car getEmptyCar() {
		
		return new Car("no model", "no concept");
		
	}
	

	
}
