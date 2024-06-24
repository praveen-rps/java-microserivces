package com.examples.spring.autowireexamples;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dao1")
@Primary
public class DemoDaoImpl implements DemoDao{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("test1 method is called");
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("test2 method is called");
		
	}

}
