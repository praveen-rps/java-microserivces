package com.example.doctor.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.doctor.dbutils.JpaDButils;
import com.example.doctor.exceptions.DoctorNotFoundException;
import com.example.doctor.model.Doctor;

import jakarta.persistence.EntityTransaction;


@Repository
public class DoctorDaoImpl implements DoctorDao{
	
	EntityTransaction tx = null;

	@Override
	public List<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		
		tx = JpaDButils.getEntityManager().getTransaction();
		tx.begin();
		List<Doctor> doctors = JpaDButils.getEntityManager()
				.createQuery("select d from Doctor d")
				.getResultList();
		return doctors;
	}

	@Override
	public int addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
	
		tx = JpaDButils.getEntityManager().getTransaction();
		tx.begin();
		JpaDButils.getEntityManager().persist(doctor);
		tx.commit();
		return 1;
	}

	@Override
	public List<Doctor> searchDoctor(String specialization) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		
		tx = JpaDButils.getEntityManager().getTransaction();
		tx.begin();
		List<Doctor> doctors = JpaDButils.getEntityManager()
				.createQuery("select d from Doctor d where d.specialization=:specialization")
				.setParameter("specialization", specialization)
				.getResultList();
		
		if (doctors.isEmpty()) {
			throw new DoctorNotFoundException();
		}
		return doctors;
	}

	@Override
	public Doctor deleteDoctor(int regno) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		
		tx = JpaDButils.getEntityManager().getTransaction();
		tx.begin();
		Doctor doctor = (Doctor)JpaDButils.getEntityManager().find(Doctor.class, regno);
		if (doctor != null) {
			JpaDButils.getEntityManager().remove(doctor);
			tx.commit();
			return doctor;
		}
		else {
			throw new DoctorNotFoundException();
		}
	}

}
