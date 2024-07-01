package com.example.orderservice.service;

import java.util.List;

import com.example.orderservice.model.Orders;

public interface OrderService {
	
	public Orders addOrder(Orders order);
	public Orders deleteOrder(Long orderId);
	public List<Orders> viewAllOrders();
	public List<Orders> viewCustomerOrders(Long customerId);

}
