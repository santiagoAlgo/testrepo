package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ErrorMessageService;

@RestController
public class JpaController {
	
	@Autowired
	ErrorMessageService errorMessageService;

	@GetMapping("/hi")
	public String HiController() {
		
		boolean result = errorMessageService.insertErrorMessage(2, "recorcholis");
	
		return "Hi, "+result;
	}
	
	
}
