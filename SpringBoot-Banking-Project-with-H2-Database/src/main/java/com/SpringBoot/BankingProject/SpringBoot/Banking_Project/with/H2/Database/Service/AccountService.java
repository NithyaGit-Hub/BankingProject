package com.SpringBoot.BankingProject.SpringBoot.Banking_Project.with.H2.Database.Service;


import java.util.List;

import com.SpringBoot.BankingProject.SpringBoot.Banking_Project.with.H2.Database.Controller.Policy;
import com.SpringBoot.BankingProject.SpringBoot.Banking_Project.with.H2.Database.entity.Account;

public interface AccountService {
	public Account createAccount(Account account);
	public Account getAccountDetailsByAccountNumber(Long accountNumber);
	public Account updateAccountDetailsByAccountNumber(Long accountNumber);
	
	
	public Policy updatePolicyDetailsByPolicyNumber(Long policyNumber);
	public Policy createPolicy(Policy policy);
	public Policy getPolicyDetailsByPolicyNumber(Long policyNumber);
	public void closePolicy(Long policyNumber);
	void deletePolicy(Long policyNumber);
	Policy deletePolicyNumber(Long policyNumber);
	
}
