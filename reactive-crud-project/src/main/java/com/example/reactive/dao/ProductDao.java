package com.example.reactive.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.example.reactive.model.Product;

import reactor.core.publisher.Flux;


@Repository
public interface ProductDao extends ReactiveMongoRepository<Product, Integer>{
	
	public Flux<Product> findByName(String name);

}
