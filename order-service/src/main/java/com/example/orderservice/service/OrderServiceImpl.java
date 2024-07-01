package com.example.orderservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderservice.dao.OrdersRepository;
import com.example.orderservice.model.Orders;


@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrdersRepository ordersRepository;

	@Override
	public Orders addOrder(Orders order) {
		// TODO Auto-generated method stub
		
		return ordersRepository.save(order);

	}

	@Override
	public Orders deleteOrder(Long orderId) {
		// TODO Auto-generated method stub
		ordersRepository.deleteById(orderId);
		return ordersRepository.findById(orderId).get();

	}

	@Override
	public List<Orders> viewAllOrders() {
		// TODO Auto-generated method stub
		return ordersRepository.findAll();

	}

	@Override
	public List<Orders> viewCustomerOrders(Long customerId) {
		// TODO Auto-generated method stub
		
		return ordersRepository.findAllByCustomerId(customerId);

	}

}
