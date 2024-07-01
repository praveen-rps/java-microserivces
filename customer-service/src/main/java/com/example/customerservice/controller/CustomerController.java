package com.example.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customerservice.model.Customer;
import com.example.customerservice.model.OrdersDto;
import com.example.customerservice.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	@GetMapping
	public List<Customer> viewAllCustomers() {
		return service.viewAllCustomers();
	}
	
	@PostMapping
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}
	
	@DeleteMapping("/{customerId}")
	public Customer deleteCustomer(@PathVariable Long customerId) {
		return service.deleteCustomer(customerId);
	}
	
	@GetMapping("/orders/{customerId}")
	public List<OrdersDto> viewCustomerOrders(@PathVariable Long customerId) {
		return service.viewCustomerOrders(customerId);
	}

}
