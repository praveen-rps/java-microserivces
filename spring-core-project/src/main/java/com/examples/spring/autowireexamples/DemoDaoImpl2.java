package com.examples.spring.autowireexamples;

import org.springframework.stereotype.Component;

@Component("dao2")
public class DemoDaoImpl2 implements DemoDao{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("test1 method is called from DemoDaoImpl2");
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
		System.out.println("test2 method is called from DemoDaoImpl2");
		
	}

}
