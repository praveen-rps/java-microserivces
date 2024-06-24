package com.examples.spring.autowireexamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DemoService {
	
	@Autowired
	@Qualifier("dao2")
	DemoDao demoDao;

	
	public void testA() {
		demoDao.test1();
	}

	public void testB() {
		demoDao.test2();
	}

}
