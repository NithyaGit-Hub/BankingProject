package com.SpringBoot.BankingProject.SpringBoot.Banking_Project.with.H2.Database.Service;

import com.SpringBoot.BankingProject.SpringBoot.Banking_Project.with.H2.Database.Controller.Policy;
import com.SpringBoot.BankingProject.SpringBoot.Banking_Project.with.H2.Database.entity.Account;
import com.SpringBoot.BankingProject.SpringBoot.Banking_Project.with.H2.Database.repo.AccountRepository;
@Service
public class PolicyServiceImplementation implements PolicyService{

	@AutoWired
	AccountRepository repo;
	
	@Override
	public Policy createPolicy(Policy policy){
		// TODO Auto-generated method stub
		Policy policy_saved=repo.save(policy);
		return policy_saved;
	}

	@Override
	public Policy getPolicyDetailsByPolicyNumber(Long policyNumber) {
		// TODO Auto-generated method stub
		Optional<Policy> policy = repo.findById(policyNumber);
		if(policy.isEmpty()) {
			throw new RuntimeException("Account does not exist");
		}
		Policy policy_found=policy.get();
	return policy_found;
	}

	@Override
	public Policy updatePolicyDetailsByPolicyNumber(Long policyNumber) {
		// TODO Auto-generated method stub
		return null;
	}
	public Policy deletePolicyNumber(Long policyNumber) {
		// TODO Auto-generated method stub
		return null;
	}



}
