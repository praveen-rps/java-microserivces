package com.examples.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.examples.hibernate.model.Student;

public class Hibutils {
	
	private static SessionFactory sessionFactory;
	
	static {
		try {
			
			Configuration configuration = 
					new Configuration()
				         .setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver")
				         .setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/wiprodb")
				         .setProperty("hibernate.connection.username", "root")
				         .setProperty("hibernate.connection.password", "root")
				         .setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")
				         .setProperty("hibernate.hbm2ddl.auto", "update")
				         .setProperty("hibernate.show_sql", "true")
				         .addAnnotatedClass(Student.class);
			sessionFactory = configuration.buildSessionFactory();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
