package com.examples.training.reflection;

import java.io.Serializable;

public class Person implements Serializable, Interface1{
	
	private String name;
	private int age;
	
	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void printPerson() {
		System.out.println("Name: " + name + " Age: " + age);
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method1");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Method2");
		
	}

}
