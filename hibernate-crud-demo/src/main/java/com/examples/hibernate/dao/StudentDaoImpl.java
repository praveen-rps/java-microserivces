package com.examples.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.examples.hibernate.model.Student;
import com.examples.hibernate.utils.Hibutils;



public class StudentDaoImpl implements StudentDao {

	private SessionFactory sessionFactory;
	
	public StudentDaoImpl() {
		sessionFactory = Hibutils.getSessionFactory();
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		List<Student> students = session.createQuery("from Student").list();
		transaction.commit();
		return students;
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Student student = session.get(Student.class, id);
		session.close();
		transaction.commit();
		return student;
		
		
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(student);
		transaction.commit();
		session.close();
		transaction.commit();
		return student;
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Student student = session.get(Student.class, id);
		session.remove(student);
		transaction.commit();
		transaction.commit();
		session.clear();

	}

}
