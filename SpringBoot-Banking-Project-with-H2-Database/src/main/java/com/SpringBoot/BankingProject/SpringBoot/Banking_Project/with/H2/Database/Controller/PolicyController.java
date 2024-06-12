package com.SpringBoot.BankingProject.SpringBoot.Banking_Project.with.H2.Database.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.SpringBoot.BankingProject.SpringBoot.Banking_Project.with.H2.Database.Service.AccountService;
import com.SpringBoot.BankingProject.SpringBoot.Banking_Project.with.H2.Database.entity.Account;


@RestController
@RequestMapping("/policy")
public class PolicyController{
	
	@AutoWired
	AccountService service;
		
	//create the account
	@PostMapping("/create")
	public ResponseEntity<Policy> createPolicy(@RequestBody Policy policy)
	{
		Policy createPolicy = service.createPolicy(policy);
		return ResponseEntity.status(HttpStatus.CREATED).body(createPolicy);
	}
	
    @GetMapping("/{policyNumber}")
    public Policy getPolicyByPolicyNumber(@PathVariable Long policyNumber) {
    	Policy policy = service.getPolicyDetailsByPolicyNumber(policyNumber);
    	return policy;
    }
    
    @PutMapping("/update/{policyNumber}/{number}")
    public Policy update(@PathVariable Long policyNumber) {
    	Policy policy = service.updatePolicyDetailsByPolicyNumber(policyNumber);
    		return policy;
    	}
    	
    @DeleteMapping("/delete/{policyNumber}")
    public ResponseEntity<String> deletePolicy(@PathVariable Long policyNumber) {
    	
    	service.closePolicy(policyNumber);
    	return ResponseEntity.status(HttpStatus.ACCEPTED).body("Policy closed");
    }
    }

