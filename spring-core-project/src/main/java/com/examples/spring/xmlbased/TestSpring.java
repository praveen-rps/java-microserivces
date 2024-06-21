package com.examples.spring.xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		
		Address adr1 =(Address)context.getBean("address");
	//	Address adr1 = context.getBean(Address.class);
		System.out.println(adr1);
		
		Address adr2 =(Address)context.getBean("address");
		System.out.println(adr2);
		
		//Employee e = (Employee)context.getBean("emp");
	    Employee e= context.getBean(Employee.class);
		System.out.println(e);
		
		Person p = (Person)context.getBean("person");
		System.out.println(p);
		
	}

}
