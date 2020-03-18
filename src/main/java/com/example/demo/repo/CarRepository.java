package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{

	@Query(value = "select * from cars c where c.car_model = 'Civic'", nativeQuery = true)
	List<Car> findCivic();
	
	List<Car> findByCarModel(String carModel);
	
    @Query("select c from Car c where c.carModel = 'Civic'")
    List<Car> findByNameEndsWith(String chars);
    
    @Query("select c from Car c where c.carModel =  ?1 and c.concept =  ?2")
    List<Car> findcarByModelConcept(String carModel,  String concept);
    
    List<Car> findByCarModelAndConcept(String carModel,  String concept);
    
    
    
	
}
