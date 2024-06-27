package com.example.insurance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.insurance.dao.PolicyDao;
import com.example.insurance.model.Policy;


@Service
public class PolicyServiceImpl implements PolicyService {
	
	@Autowired
	PolicyDao policyDao;

	@Override
	public Policy addPolicy(Policy policy) {
		// TODO Auto-generated method stub
		return policyDao.save(policy);
	}

	@Override
	public List<Policy> viewAllPolicies() {
		// TODO Auto-generated method stub
		return policyDao.findAll();
	}

	@Override
	public Optional<Policy> viewPolicyById(int policyId) {
		// TODO Auto-generated method stub
		return policyDao.findById(policyId);
	}

	@Override
	public void deletePolicy(int policyId) {
		// TODO Auto-generated method stub
		policyDao.deleteById(policyId);

	}

	@Override
	public List<Policy> getPolciesByPolicyType(String type) {
		// TODO Auto-generated method stub
		return policyDao.findAllByType(type);
		
	}

	@Override
	public List<Policy> getPoliciesByPolicyName(String name) {
		// TODO Auto-generated method stub
		return policyDao.findAllByName(name);
	}

	@Override
	public List<Policy> getPoliciesByPremiumLessThan(int premium) {
		// TODO Auto-generated method stub
		return policyDao.findByPremiumLessThan(premium);
	}

	@Override
	public List<Policy> getPoliciesByPremiumAndType(int premium, String type) {
		// TODO Auto-generated method stub
		return policyDao.findByPremiumAndType(premium, type);
	}

}
