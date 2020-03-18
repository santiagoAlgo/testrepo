package com.example.demo.service;

public interface ErrorMessageService {
	
	public boolean insertErrorMessage(int banxicoCode, String banxicoDecription);
	
	public default String sayChees() {
		return "Cheese";
	}

}
