package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ErrorMessage;

@Repository
public interface ErrorMessageRepository extends JpaRepository<ErrorMessage, Long>{
	
}

