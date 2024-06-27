package com.example.flight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flight.model.Flight;
import com.example.flight.service.FlightService;

@RestController
@RequestMapping("/flights")
public class FlightController {
	
	@Autowired
	FlightService flightService;
	
	@GetMapping
	public List<Flight> getFlights() {
		return flightService.viewAllFlights();
	}
	
	@PostMapping
	public Flight addFlight(@RequestBody Flight flight) {
		return flightService.addFlight(flight);
	}
	
	@GetMapping("/{flightNumber}")
	public Flight getFlightById(@PathVariable String flightNumber) {
		return flightService.viewFlightById(flightNumber).get();
	}
	
	@DeleteMapping("/{flightNumber}")
	public ResponseEntity<String> deleteFlight(@PathVariable String flightNumber) {
		flightService.deleteFlight(flightNumber);
		return new ResponseEntity<>("Flight Deleted",HttpStatus.NO_CONTENT);
	}

}
