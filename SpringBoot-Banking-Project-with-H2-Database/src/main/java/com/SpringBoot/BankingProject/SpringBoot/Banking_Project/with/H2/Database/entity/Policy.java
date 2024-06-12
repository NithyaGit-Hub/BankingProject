package com.SpringBoot.BankingProject.SpringBoot.Banking_Project.with.H2.Database.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table

public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long policy_number;
	@Column
	private String policy_name;
	@Column
	private String policy_holder_name;
   {
		
	}
	
	public Policy(String account_holder_name) {
		super();
		this.policy_holder_name = policy_holder_name;
	}

	public Long getPolicy_number() {
		return policy_number;
	}
	public void setPolicy_number(Long policy_number) {
		this.policy_number = policy_number;
	}
	public String getPolicy_holder_name() {
		return policy_holder_name;
	}
	public void setPolicy_holder_name(String policy_holder_name) {
		this.policy_holder_name = policy_holder_name;
	}
	
	@Override
	public String toString() {
		return "Policy [policy_number=" + policy_number + ", policy_holder_name=" + policy_holder_name
				+ "]";
	}

}
