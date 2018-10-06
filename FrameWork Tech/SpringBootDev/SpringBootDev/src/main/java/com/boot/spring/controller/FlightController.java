package com.boot.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.spring.model.Flight;
import com.boot.spring.service.FlightService;

@RestController
public class FlightController {
	
	@Autowired
	private FlightService flightService;
	
	@GetMapping(path="/")
	public String home()
	{
		return "Welcome to Spring Boot application";
	}
	
	@RequestMapping(path="/saveFlight", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	
	public @ResponseBody Flight saveFlight(@RequestBody Flight flight)
	{
		return flightService.addFlight(flight);
	}
	
	@GetMapping(path="/getFlights")
	public List<Flight> getFlights()
	{
		return flightService.getAllFlights();
	}
	
	
	@RequestMapping(path="/flightById/{code}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	
	public @ResponseBody Flight getFlightById(@PathVariable int code)
	{
		return flightService.getFlightById(code);
	} 
}
















