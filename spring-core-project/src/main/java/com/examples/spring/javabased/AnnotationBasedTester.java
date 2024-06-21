package com.examples.spring.javabased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationBasedTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext config = 
				new AnnotationConfigApplicationContext(BeansConfigurations.class);
		
		Book b1 = (Book) config.getBean("book2");
		System.out.println(b1);
		
		Book b2 = (Book) config.getBean("book2");
		System.out.println(b2);
		
		
		Publisher p = config.getBean(Publisher.class);
		System.out.println(p);
		
		Author a = config.getBean(Author.class);
		System.out.println(a);
		

	}

}
