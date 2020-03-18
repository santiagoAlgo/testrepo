package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Magazine {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long magazineId;
	
	private String name;

	public long getMagazineId() {
		return magazineId;
	}

	public void setMagazineId(long magazineId) {
		this.magazineId = magazineId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Magazine(long magazineId, String name) {
		super();
		this.magazineId = magazineId;
		this.name = name;
	}
	
	public Magazine(String name) {
		super();

		this.name = name;
	}
	
	public Magazine() {
		super();
	}
	
	
	
}
