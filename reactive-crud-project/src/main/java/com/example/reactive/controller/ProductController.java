package com.example.reactive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reactive.model.Product;
import com.example.reactive.service.ProductService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
	@GetMapping
	public Flux<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	
	@PostMapping
	public Mono<Product> addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	@GetMapping("/{pid}")
	public Mono<Product> getProduct(@PathVariable int pid) {
		return productService.getProduct(pid);
	}
	
	@GetMapping("/search/{name}")
	public Flux<Product> searchProductByName(@PathVariable String name) {
		return productService.searchProductByName(name);
	}
	

}
