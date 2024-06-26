package com.examples.jpa.main;

import com.examples.jpa.model.Publisher;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JpaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("PERSISTENCE");
		
		EntityManager entityManager = factory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		//Publisher publisher = new Publisher(1,"Vikas","Mumbai");
	//	Author author = new Author(2,"Viswanath","Sports",20);
		Publisher publisher = entityManager.find(Publisher.class, 1);
		
		publisher.setPname("S Chand");
		publisher.setPaddress("Delhi");
		entityManager.persist(publisher);
		
	//	Author author = entityManager.find(Author.class, 1);
	//	entityManager.remove(author);
	//	System.out.println(author);
		transaction.commit();
		System.out.println("Publisher  data modified successfully..");
		
		

	}

}
