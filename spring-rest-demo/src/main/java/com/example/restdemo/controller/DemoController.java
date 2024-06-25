package com.example.restdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@PostMapping("/postCity")
	public City postCityDetails(@RequestBody City city) {
		city.setName(city.getName().toUpperCase());
		return city;
	}
	
	@GetMapping("/city/{name}/{max}")
	public City getCityDetails(@PathVariable String name,
			@PathVariable int  max) {
		City city = new City();
		city.setName(name);
		city.setMax(max);
		return city;
	}
	
	
	@GetMapping("/hello")
	public String hello(){
        return "Hello from Spring Boot";
    } 
	
	@GetMapping("/bye")
	public String bye(){
        return "Bye from Spring Boot";
    } 

}
