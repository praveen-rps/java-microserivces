package com.example.reactive.service;

import com.example.reactive.model.Product;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {
	
	public Flux<Product> getAllProducts();
	public Mono<Product> addProduct(Product product);
	public Mono<Product> getProduct(int pid);
	public Flux<Product> searchProductByName(String name);

}
