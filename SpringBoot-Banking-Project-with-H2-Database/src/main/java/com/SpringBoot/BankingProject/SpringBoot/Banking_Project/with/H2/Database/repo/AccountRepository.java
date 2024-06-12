package com.SpringBoot.BankingProject.SpringBoot.Banking_Project.with.H2.Database.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.BankingProject.SpringBoot.Banking_Project.with.H2.Database.Controller.Policy;
import com.SpringBoot.BankingProject.SpringBoot.Banking_Project.with.H2.Database.entity.Account;
public interface AccountRepository extends JpaRepository<Account, Long>{

	Policy save(Policy policy);

}
