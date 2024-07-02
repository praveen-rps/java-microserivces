package com.example.customerservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	CustomerService service;
	
	@GetMapping("/getOrdersPort")
	public String getOrdersPort() {
		return service.getOrdersPort();
	}
	
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
	@Retry(name="customers", fallbackMethod="viewCustomerOrdersFallback")
	public List<OrdersDto> viewCustomerOrders(@PathVariable Long customerId) {
		logger.info("CustomerController is called");
		return service.viewCustomerOrders(customerId);
	}
	
	public List<OrdersDto> viewCustomerOrdersFallback(Long customerId, Exception e) {
		List<OrdersDto> data = new ArrayList();
		data.add(new OrdersDto(11111L,"Dummy Product1",22222L));
		data.add(new OrdersDto(11112L,"Dummy Product2",32222L));
		data.add(new OrdersDto(11113L,"Dummy Product3",42222L));
		data.add(new OrdersDto(11114L,"Dummy Product4",52222L));
		
		return data;
	}

}
