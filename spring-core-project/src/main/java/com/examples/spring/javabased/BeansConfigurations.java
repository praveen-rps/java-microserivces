package com.examples.spring.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeansConfigurations {
	
	@Bean(name="book1")
	@Scope("prototype")
	public Book book1() {
		return new Book(1001, "Spring", "Rod Johnson");
	}
	
	@Bean(name="book2")
	@Scope("prototype")
	public Book book2() {
		return new Book(1002, "C Prog", "Balaguruswamy");
	}
	
	@Bean("publisher")
	public Publisher publisher() {
		return new Publisher("P101", "Wrox", "UK");
	}
	
	@Bean
	public Author author() {
        return new Author("A101", "James", "james@gmail.com", publisher());
	}

}
