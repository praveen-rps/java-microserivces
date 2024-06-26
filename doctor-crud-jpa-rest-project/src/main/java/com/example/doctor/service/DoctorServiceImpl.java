package com.example.doctor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.doctor.dao.DoctorDao;
import com.example.doctor.exceptions.DoctorNotFoundException;
import com.example.doctor.model.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService{
	
	@Autowired
	DoctorDao doctorDao;

	@Override
	public List<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		return doctorDao.getAllDoctors();
	}

	@Override
	public int addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorDao.addDoctor(doctor);
	}

	@Override
	public List<Doctor> searchDoctor(String specialization) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return doctorDao.searchDoctor(specialization);
	}

	@Override
	public Doctor deleteDoctor(int regno) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return doctorDao.deleteDoctor(regno);
	}

}
