package com.example.flight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.flight")
public class FlightRestJpaCrudProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightRestJpaCrudProjectApplication.class, args);
	}

}
