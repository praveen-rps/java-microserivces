package com.examples.spring.annotationbased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.examples.spring.javabased.BeansConfigurations;

public class AnnotationBasedTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext config = 
				new AnnotationConfigApplicationContext(CarConfigurations.class);
		
		Car c1 = (Car) config.getBean("car");
		System.out.println(c1);
		
		Engine e = config.getBean(Engine.class);
		System.out.println(e);

	}

}
