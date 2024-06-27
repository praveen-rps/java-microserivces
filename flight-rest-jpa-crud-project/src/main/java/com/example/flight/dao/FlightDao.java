package com.example.flight.dao;

import java.util.List;
import java.util.Optional;

import com.example.flight.model.Flight;

public interface FlightDao {
	
	public Flight addFlight(Flight flight);
	public List<Flight> viewAllFlights();
	public Optional<Flight> viewFlightById(String flightNumber);
	public void deleteFlight(String flightNumber);

}
