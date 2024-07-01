package com.example.customerservice.service;

import java.util.List;

import com.example.customerservice.model.Customer;
import com.example.customerservice.model.OrdersDto;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer);
	public Customer deleteCustomer(Long customerId);
	public List<OrdersDto> viewCustomerOrders(Long customerId);
	public List<Customer> viewAllCustomers();

}
