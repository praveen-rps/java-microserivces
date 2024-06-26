package com.example.doctor.controller;

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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.doctor.model.Doctor;
import com.example.doctor.service.DoctorService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
	
	@Autowired
	DoctorService service;
	
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Doctor> getAllDoctors() {
		return service.getAllDoctors();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Integer> addDoctor(@RequestBody Doctor doctor) {
		return new ResponseEntity(service.addDoctor(doctor), HttpStatus.CREATED);
	}
	
	@GetMapping("/search/{specialization}")
	@ResponseStatus(HttpStatus.OK)
	public List<Doctor> searchDoctor(@PathVariable String specialization) {
		return service.searchDoctor(specialization);
	}
	
	@DeleteMapping("/delete/{regno}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public ResponseEntity<String> deleteDoctor(@PathVariable int regno) {
		Doctor doctor = service.deleteDoctor(regno);
		if (doctor == null) {
			return new ResponseEntity<>("Doctor not found", HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>("Doctor Deleted", HttpStatus.OK);
		}
	}
	

}
