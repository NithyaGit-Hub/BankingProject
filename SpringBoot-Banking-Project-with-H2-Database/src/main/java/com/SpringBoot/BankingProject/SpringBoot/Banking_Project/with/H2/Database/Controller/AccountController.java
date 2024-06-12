package com.SpringBoot.BankingProject.SpringBoot.Banking_Project.with.H2.Database.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.SpringBoot.BankingProject.SpringBoot.Banking_Project.with.H2.Database.Service.AccountService;
import com.SpringBoot.BankingProject.SpringBoot.Banking_Project.with.H2.Database.entity.Account;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@AutoWired
	AccountService service;
	
	

	//create the account
	@PostMapping("/create")
	public ResponseEntity<Account> createAccount(@RequestBody Account account)
	{
		Account createAccount = service.createAccount(account);
		return ResponseEntity.status(HttpStatus.CREATED).body(createAccount);
	}
	
    @GetMapping("/{accountNumber}")
    public Account getAccountByAccountNumber(@PathVariable Long accountNumber) {
    	Account account = service.getAccountDetailsByAccountNumber(accountNumber);
    	return account;
    }
    
    @PutMapping("/update/{accountNumber}/{number}")
    public Account update(@PathVariable Long accountNumber) {
    	Account account = service.updateAccountDetailsByAccountNumber(accountNumber);
    		return account;
    	}
    	
    }


