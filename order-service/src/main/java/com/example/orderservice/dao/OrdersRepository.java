package com.example.orderservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.orderservice.model.Orders;


@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long>{
	
	public List<Orders> findAllByCustomerId(Long customerId);

}
