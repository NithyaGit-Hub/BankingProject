package com.SpringBoot.BankingProject.SpringBoot.Banking_Project.with.H2.Database.Service;

import java.util.List;

import com.SpringBoot.BankingProject.SpringBoot.Banking_Project.with.H2.Database.Controller.Policy;
import com.SpringBoot.BankingProject.SpringBoot.Banking_Project.with.H2.Database.entity.Account;

public interface PolicyService {
	public Policy createPolicy(Policy policy);
	public Policy getPolicyDetailsByPolicyNumber(Long policyNumber);
	public Policy updatePolicyDetailsByPolicyNumber(Long policyNumber);
	
	
}
