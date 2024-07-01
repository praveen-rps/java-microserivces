package com.example.customerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.customerservice.dao.CustomerDao;
import com.example.customerservice.model.Customer;
import com.example.customerservice.model.OrdersDto;


@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	RestTemplate restTemplate;
	
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
	public List<OrdersDto> viewCustomerOrders(Long customerId) {
		// TODO Auto-generated method stub
		String url= "http://localhost:8082/orders/customer/"+customerId;
		return restTemplate.getForObject("http://localhost:8082/orders/customer/"+customerId, List.class);
		//return restTemplate.getForObject("http://ORDER-SERVICE/orders/customer/"+customerId, List.class);
	

	}

	@Override
	public List<Customer> viewAllCustomers() {
		// TODO Auto-generated method stub
		return customerDao.findAll();
	}

}
