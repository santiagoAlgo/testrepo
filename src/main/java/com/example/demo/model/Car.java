package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cars")
public class Car {
	
	@Id
	@Column(name="car_id")
	//@GeneratedValue(strategy =  GenerationType.AUTO)
	private long carId;
	
	public Car() {
		
	}
	
	public Car(String carModel) {
		this.carModel = carModel;
	}
	
	public Car(String carModel, String concept) {
		super();
		this.carModel = carModel;
		this.concept = concept;
	}
	private String carModel;
	private String concept;
	public long getCarId() {
		return carId;
	}
	public void setCarId(long carId) {
		this.carId = carId;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getConcept() {
		return concept;
	}
	public void setConcept(String concept) {
		this.concept = concept;
	}
	
	
	

}
