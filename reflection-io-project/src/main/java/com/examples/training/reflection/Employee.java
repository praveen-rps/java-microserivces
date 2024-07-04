package com.examples.training.reflection;

import java.io.Serializable;

public class Employee implements Serializable{
	
	int empid;
	
	String name;
	
	String detp;
	
	public Employee() {
		super();
	}

	public Employee(int empid, String name, String detp) {
		super();
		this.empid = empid;
		this.name = name;
		this.detp = detp;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetp() {
		return detp;
	}

	public void setDetp(String detp) {
		this.detp = detp;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", detp=" + detp + "]";
	}
	

}
