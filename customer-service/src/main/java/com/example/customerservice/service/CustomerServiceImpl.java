package com.example.customerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customerservice.dao.CustomerDao;
import com.example.customerservice.model.Customer;


@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.save(customer);
	}

	@Override
	public Customer deleteCustomer(Long customerId) {
		// TODO Auto-generated method stub
		customerDao.deleteById(customerId);
		return customerDao.findById(customerId).get();
	}

	@Override
	public void viewCustomerOrders(Long customerId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Customer> viewAllCustomers() {
		// TODO Auto-generated method stub
		return customerDao.findAll();
	}

}
