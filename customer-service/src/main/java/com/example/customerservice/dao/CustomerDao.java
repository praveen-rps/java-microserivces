package com.example.customerservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.customerservice.model.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Long>{

}
