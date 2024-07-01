package com.example.customerservice.service;

import java.util.List;

import com.example.customerservice.model.Customer;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer);
	public Customer deleteCustomer(Long customerId);
	public void viewCustomerOrders(Long customerId);
	public List<Customer> viewAllCustomers();

}
