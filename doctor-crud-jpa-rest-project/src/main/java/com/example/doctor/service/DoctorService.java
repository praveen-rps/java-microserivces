package com.example.doctor.service;

import java.util.List;

import com.example.doctor.exceptions.DoctorNotFoundException;
import com.example.doctor.model.Doctor;

public interface DoctorService {
	
	public List<Doctor> getAllDoctors();
	int addDoctor(Doctor doctor);
	List<Doctor> searchDoctor(String specialization) throws DoctorNotFoundException;
	Doctor deleteDoctor(int regno) throws DoctorNotFoundException;

}
