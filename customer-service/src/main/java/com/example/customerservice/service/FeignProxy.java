package com.example.customerservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.customerservice.model.OrdersDto;



@FeignClient(name = "ORDER-SERVICE")
public interface FeignProxy {
	
	@GetMapping("orders/port")
	public String getPort();
	
	@GetMapping("orders/customer/{customerId}")
	public List<OrdersDto> viewCustomerOrders(@PathVariable Long customerId);

}
