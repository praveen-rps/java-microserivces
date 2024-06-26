package com.example.doctor.exceptions;

public class DoctorNotFoundException extends RuntimeException {
	
	public DoctorNotFoundException() {
		super("Doctor Not found with given id or speciality or experience");
	}

}
