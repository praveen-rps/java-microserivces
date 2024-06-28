package com.examples.hibernate.controller;

import com.examples.hibernate.model.Student;
import com.examples.hibernate.service.StudentServiceImpl;

public class HibernateMainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student(1,"John",35);
	//	Student student3 = new Student(2,"Bon",25);
	//	Student student2 = new Student(3,"Alice",28);
		
		StudentServiceImpl service = new StudentServiceImpl();
		
		//service.addStudent(student1);
	//	service.addStudent(student2);
	//	service.addStudent(student3);
		
		//System.out.println("added all Students:");
		
		//service.getAllStudents().forEach(student -> System.out.println(student));
		
		//Student student = service.getStudent(1);
		//System.out.println("Student with id 1:"+student);
		
		service.deleteStudent(1);
		System.out.println("After deleting student with id 1:");

	}

}
