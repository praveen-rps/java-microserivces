package com.example.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderservice.model.Orders;
import com.example.orderservice.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	OrderService service;
	
	@GetMapping
	public List<Orders> viewAllOrders() {
		return service.viewAllOrders();
	}
	
	// http://localhost:8082/orders/customer/1
	@GetMapping("/customer/{customerId}")
	public List<Orders> viewCustomerOrders(@PathVariable Long customerId) {
		System.out.println("order contoller is called order service");
		return service.viewCustomerOrders(customerId);
	}
	
	@PostMapping
	public Orders addOrder(@RequestBody Orders order) {
		return service.addOrder(order);
	}
	
	@DeleteMapping("/{orderId}")
	public Orders deleteOrder(@PathVariable Long orderId) {
		return service.deleteOrder(orderId);
	}
	

}
