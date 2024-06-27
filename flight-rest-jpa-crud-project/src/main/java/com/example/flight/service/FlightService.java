package com.example.flight.service;

import java.util.List;
import java.util.Optional;

import com.example.flight.model.Flight;

public interface FlightService {
	
	public Flight addFlight(Flight flight);
	public List<Flight> viewAllFlights();
	public Optional<Flight> viewFlightById(String flightNumber);
	public void deleteFlight(String flightNumber);
	

}
