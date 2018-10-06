package com.boot.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.spring.model.Flight;

public interface FlightRepositories extends JpaRepository<Flight, Integer>{ 

}
