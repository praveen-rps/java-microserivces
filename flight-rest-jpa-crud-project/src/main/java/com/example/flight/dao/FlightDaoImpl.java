package com.example.flight.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.flight.model.Flight;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
public class FlightDaoImpl implements FlightDao{
	
    @PersistenceContext
    EntityManager entityManager;
    
	
	
	@Override
	@Transactional
	public Flight addFlight(Flight flight) {
		// TODO Auto-generated method stub
		if(flight.getFlightNumber()==null) {
			entityManager.persist(flight);
			return flight;
		}
		else
			return entityManager.merge(flight);
	}

	@Override
	public List<Flight> viewAllFlights() {
		// TODO Auto-generated method stub
		
		return entityManager
		.createQuery("select f from Flight f", Flight.class)
		.getResultList();
		
	}

	@Override
	public Optional<Flight> viewFlightById(String flightNumber) {
		// TODO Auto-generated method stub
		Flight flight = entityManager.find(Flight.class, flightNumber);
		return flight!=null ? Optional.of(flight):Optional.empty();
	}

	@Override
	@Transactional
	public void deleteFlight(String flightNumber) {
		// TODO Auto-generated method stub
		
	    Flight flight = entityManager.find(Flight.class, flightNumber);
	    if(flight!=null)
        	entityManager.remove(flight);
		
		
	}

}
