package com.examples.hibernate.service;

import java.util.List;

import com.examples.hibernate.dao.StudentDao;
import com.examples.hibernate.dao.StudentDaoImpl;
import com.examples.hibernate.model.Student;

public class StudentServiceImpl implements StudentService {
	
	StudentDao dao;
	
	public StudentServiceImpl() {
		dao = new StudentDaoImpl();
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return dao.getAllStudents();
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return dao.getStudent(id);
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.addStudent(student);
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		dao.deleteStudent(id);
	}

}
