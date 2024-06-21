package com.examples.spring.xmlbased;

public class Address {
	
	int dno;
	String street;
	String city;
	
	public Address() {
		super();
		System.out.println("Inside the default constructor");
	}
	
	public Address(int dno, String street, String city) {
		super();
		this.dno = dno;
		this.street = street;
		this.city = city;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public void init() {
		System.out.println("Inside the init method");
	}

	public void tearDown() {
		System.out.println("Inside the destroy method");
	}
	@Override
	public String toString() {
		return "Address [dno=" + dno + ", street=" + street + ", city=" + city + "]";
	}
	
	

}
