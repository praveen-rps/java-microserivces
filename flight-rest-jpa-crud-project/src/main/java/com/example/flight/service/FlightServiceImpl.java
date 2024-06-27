package com.example.flight.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flight.dao.FlightDao;
import com.example.flight.model.Flight;


@Service
public class FlightServiceImpl implements FlightService {
	
	@Autowired
	FlightDao flightDao;

	@Override
	public Flight addFlight(Flight flight) {
		// TODO Auto-generated method stub
		return flightDao.addFlight(flight);
	}

	@Override
	public List<Flight> viewAllFlights() {
		// TODO Auto-generated method stub
		return flightDao.viewAllFlights();
	}

	@Override
	public Optional<Flight> viewFlightById(String flightNumber) {
		// TODO Auto-generated method stub
		return flightDao.viewFlightById(flightNumber);
	}

	@Override
	public void deleteFlight(String flightNumber) {
		// TODO Auto-generated method stub
		
		flightDao.deleteFlight(flightNumber);
		
	}

}
