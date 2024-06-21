package com.examples.spring.annotationbased;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("car")
@Scope("prototype")
public class Car {
	
	String model;
	String color;
	String fuel;
	
	@Autowired
	Engine engine;
	
	public Car() {
		model = "BMW";
		color = "Black";
		fuel = "Petrol";
	}
	
	public Car(String model, String color, String fuel) {
		this.model = model;
		this.color = color;
		this.fuel = fuel;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
	@PostConstruct // intialize the bean
	public void init() {
		System.out.println("Car bean is initialized");
	}
	
	@PreDestroy // destroy the bean
	public void destroy() {
		System.out.println("Car bean is destroyed");
	}
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", fuel=" + fuel + ", engine=" + engine + "]";
	}

}
