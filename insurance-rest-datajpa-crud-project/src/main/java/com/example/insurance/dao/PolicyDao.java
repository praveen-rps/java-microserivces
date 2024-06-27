package com.example.insurance.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.insurance.model.Policy;


@Repository
public interface PolicyDao extends JpaRepository<Policy, Integer>{
	
	public List<Policy> findAllByType(String type);
	public List<Policy> findAllByName(String name);
	public List<Policy> findByPremiumLessThan(int premium);
	
	@Query("select p from Policy p where p.premium < :premium and p.type = :type")
	public List<Policy> findByPremiumAndType(int premium, String type);

}
