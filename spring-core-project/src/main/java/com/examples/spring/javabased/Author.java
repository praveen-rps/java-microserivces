package com.examples.spring.javabased;

import org.springframework.stereotype.Component;

@Component
public class Author {

	String aid;
	String name;
	String email;
	Publisher publisher;
	public Author() {
	}

	public Author(String aid, String name, String email, Publisher publisher) {
		this.aid = aid;
		this.name = name;
		this.email = email;
		this.publisher = publisher;
	}

	public String getAid() {
		return aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Publisher getPublisher() {
		return publisher;
	}
	
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		return "Author [aid=" + aid + ", name=" + name + ", email=" + email + ", publisher=" + publisher + "]";
	}

}
