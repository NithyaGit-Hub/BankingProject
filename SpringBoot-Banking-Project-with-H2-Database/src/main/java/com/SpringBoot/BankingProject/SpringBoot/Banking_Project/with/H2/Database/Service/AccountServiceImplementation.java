package com.SpringBoot.BankingProject.SpringBoot.Banking_Project.with.H2.Database.Service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.SpringBoot.BankingProject.SpringBoot.Banking_Project.with.H2.Database.Controller.Policy;
import com.SpringBoot.BankingProject.SpringBoot.Banking_Project.with.H2.Database.entity.Account;
import com.SpringBoot.BankingProject.SpringBoot.Banking_Project.with.H2.Database.repo.AccountRepository;
@Service
public class AccountServiceImplementation implements AccountService{

	@AutoWired
	AccountRepository repo;
	
	@Override
	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		Account account_saved=repo.save(account);
		return account_saved;
	}

	@Override
	public Account getAccountDetailsByAccountNumber(Long accountNumber) {
		// TODO Auto-generated method stub
		Optional<Account> account = repo.findById(accountNumber);
		if(account.isEmpty()) {
			throw new RuntimeException("Account does not exist");
		}
		Account account_found=account.get();
	return account_found;
	}

	@Override
	public Account updateAccountDetailsByAccountNumber(Long accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Policy createPolicy(Policy policy) {
		// TODO Auto-generated method stub
		return null;
	}
		@Override
		public Policy getPolicyDetailsByPolicyNumber(Long policyNumber) {
			// TODO Auto-generated method stub
			return null;
		}
	@Override
	public Policy updatePolicyDetailsByPolicyNumber(Long policyNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void closePolicy(Long policyNumber) {
		// TODO Auto-generated method stub
		
	}



	public Policy deletePolicyNumber(Long policyNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePolicy(Long policyNumber) {
		// TODO Auto-generated method stub
		
	}

	
	}

		


