package com.examples.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Publisher {
	
	@Id
	int pid;
	
	String pname;
	
	String paddress;
	
	public Publisher() {
		super();
	}

	public Publisher(int pid, String pname, String paddress) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.paddress = paddress;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	
	

}
