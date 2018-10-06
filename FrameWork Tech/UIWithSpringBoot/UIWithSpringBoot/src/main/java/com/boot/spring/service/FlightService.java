package com.boot.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.spring.model.Flight;
import com.boot.spring.repositories.FlightRepositories;

@Service
public class FlightService {

	@Autowired
	private FlightRepositories repo;
	private List<Flight> flightList;
	
	public Flight addFlight(Flight flight){
		
		//insert query generated
		return repo.save(flight);
	}
	
	public List<Flight> getAllFlights()
	{
		flightList = new ArrayList<Flight>();
		//Equivalent to select * from
		repo.findAll().forEach(flightList::add);
		return flightList;
	}
	
	public Flight getFlightById(int flightCode)
	{
		// select * from flight where flightCode=?
		return repo.findOne(flightCode);
	}
	
	public void deleteFlight(int flightCode)
	{
		repo.delete(flightCode); 
	}
	
}







