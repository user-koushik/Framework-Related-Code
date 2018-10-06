package com.boot.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.spring.model.Flight;
import com.boot.spring.service.FlightService;

//@RestController	// THis is not supported for UI operation 

@Controller
public class FlightController {
	
	@Autowired
	private FlightService flightService;
	
	@GetMapping(path="/")
	public String home(Model model)
	{
		//return "Welcome to Spring Boot application";
		
		model.addAttribute("flightList", flightService.getAllFlights());
		return "home";
		
	}
	
	// Saving the Data through Postman
	/*@RequestMapping(path="/saveFlight", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)*/
	
	@RequestMapping(path="/saveFlight", method=RequestMethod.POST)
	public String saveFlight(@ModelAttribute Flight flight)
	{
		flightService.addFlight(flight);
		return "redirect:/";
	}
	
	
	// Getting the Data from Web browser
	@GetMapping(path="/getFlights")
	public List<Flight> getFlights()
	{
		return flightService.getAllFlights();
	}
	
	
	//Getting the data by Id
	@RequestMapping(path="/flightById/{code}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Flight getFlightById(@PathVariable int code)
	{
		return flightService.getFlightById(code);
	} 
	
	@GetMapping(path="/search")
	public String search()
	{ 
		return "search";
	}
	
	@RequestMapping(path="/searchFlight" , method=RequestMethod.POST) 
	public String searchFlight(Model model , @ModelAttribute Flight flight)
	{
		model.addAttribute("flight", flightService.getFlightById(flight.getFlightCode()));
		return "search";
		
	}
}
















