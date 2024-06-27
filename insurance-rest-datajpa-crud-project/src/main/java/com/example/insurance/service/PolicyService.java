package com.example.insurance.service;

import java.util.List;
import java.util.Optional;

import com.example.insurance.model.Policy;

public interface PolicyService {
	
	public Policy addPolicy(Policy policy);

	public List<Policy> viewAllPolicies();

	public Optional<Policy> viewPolicyById(int policyId);

	public void deletePolicy(int policyId);
	
	public List<Policy> getPolciesByPolicyType(String type);
	
	public List<Policy> getPoliciesByPolicyName(String name);
	
	public List<Policy> getPoliciesByPremiumLessThan(int premium);
	
	public List<Policy> getPoliciesByPremiumAndType(int premium, String type);

}
