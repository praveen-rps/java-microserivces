package com.examples.hibernate.service;

import java.util.List;

import com.examples.hibernate.model.Student;

public interface StudentService {
	
	public List<Student> getAllStudents();
	public Student getStudent(int id);
	public Student addStudent(Student student);
	public void deleteStudent(int id);
	

}
