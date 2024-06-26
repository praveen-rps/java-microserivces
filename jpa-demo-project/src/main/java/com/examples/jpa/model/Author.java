package com.examples.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "author")
public class Author {
	
	@Id
	int id;
	
	@Column(name = "author_name")
	String name;
	
	@Column(name = "author_area")
	String area;
	
	@Column(name = "no_of_books")
	int noOfBooks;
	
	public Author() {
		super();
	}

	public Author(int id, String name, String area, int noOfBooks) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
		this.noOfBooks = noOfBooks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getNoOfBooks() {
		return noOfBooks;
	}

	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", area=" + area + ", noOfBooks=" + noOfBooks + "]";
	}
	
	
}
