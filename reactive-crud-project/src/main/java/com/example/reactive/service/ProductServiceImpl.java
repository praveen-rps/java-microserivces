package com.example.reactive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reactive.dao.ProductDao;
import com.example.reactive.model.Product;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDao productDao;

	@Override
	public Flux<Product> getAllProducts() {
		// TODO Auto-generated method stub
	
		
		return productDao.findAll();
	}

	@Override
	public Mono<Product> addProduct(Product product) {
		// TODO Auto-generated method stub
		
		
		return productDao.save(product);
	}

	@Override
	public Mono<Product> getProduct(int pid) {
		// TODO Auto-generated method stub
		return productDao.findById(pid);
	}

	@Override
	public Flux<Product> searchProductByName(String name) {
		// TODO Auto-generated method stub
		return productDao.findByName(name);
	}

}
