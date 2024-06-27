package com.example.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.insurance.model.Policy;
import com.example.insurance.service.PolicyService;

@RestController
@RequestMapping("/policy")
public class PolicyController {
	
	@Autowired
	PolicyService policyService;
	
	@GetMapping("/premium/{premium}/type/{type}")
	public List<Policy> getPoliciesByPremiumAndType(@PathVariable int premium, @PathVariable String type) {
		return policyService.getPoliciesByPremiumAndType(premium, type);
	}
	
	@GetMapping("/premium/{premium}")
	public List<Policy> getPoliciesByPremiumLessThan(@PathVariable int premium) {
		return policyService.getPoliciesByPremiumLessThan(premium);
	}
	
	@GetMapping("/type/{type}")
	public List<Policy> getPoliciesByPolicyType(@PathVariable String type) {
		return policyService.getPolciesByPolicyType(type);
	}
	
	@GetMapping("/name/{name}")
	public List<Policy> getPoliciesByPolicyName(@PathVariable String name) {
		return policyService.getPoliciesByPolicyName(name);
	}
	
	@GetMapping
	public List<Policy> getPolicies() {
		return policyService.viewAllPolicies();
	}
	
	@PostMapping
	public Policy addPolicy(@RequestBody Policy policy) {
		return policyService.addPolicy(policy);
	}
	
	@GetMapping("/{policyId}")
	public Policy getPolicyById(@PathVariable int policyId) {
		return policyService.viewPolicyById(policyId).get();
	}
	
	@DeleteMapping("/{policyId}")
	public ResponseEntity<String> deletePolicy(@PathVariable int policyId) {
		policyService.deletePolicy(policyId);
		return new ResponseEntity<>("Policy Deleted", HttpStatus.NO_CONTENT);
	}

}
