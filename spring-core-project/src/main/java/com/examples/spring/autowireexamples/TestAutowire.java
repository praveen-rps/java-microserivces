package com.examples.spring.autowireexamples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.examples.spring.annotationbased.CarConfigurations;

public class TestAutowire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext config = 
				new AnnotationConfigApplicationContext(DemoConfiguration.class);
		
		DemoService service = config.getBean(DemoService.class);
		
		service.testA();
		service.testB();
		
		
	
	
	}

}
