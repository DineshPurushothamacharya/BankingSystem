package com.greatlearning.service;

import java.util.Iterator;

import com.greatlearning.model.Bank;
import com.greatlearning.model.Customer;

public class BankingService {
	
	private Bank bank;

	public BankingService(Bank bank) {
		this.bank = bank;
		bank.addCustomers(new Customer("Adarsha", "1234"), 0);
		bank.addCustomers(new Customer("Manjunatha", "5678"), 1);
	}
	
	public void addCustomerToBank(Customer customer)
	{
		//bank.addCustomers(customer);
	}
	
	public double depositToAccount(String account, double amount)
	{
		Customer customer = this.getCustomerById(account);
		if(customer != null) {
			customer.setBalance(customer.getBalance() + amount);
		}
		
		return customer.getBalance();
	}
	
	public boolean withdrawFromAccount(String account, double amount)
	{
		Customer customer = this.getCustomerById(account);
		if(customer != null) {
			customer.setBalance(customer.getBalance() - amount);
			return true;
		}
		return false;
	}
	
	public double getCustomerBalance(String account)
	{
		Customer customer = this.getCustomerById(account);
		if(customer != null) return customer.getBalance();
		return 0.0;
	}
	
	
	public boolean transfer(String account1, String account2, double amount)
	{
		if(getCustomerBalance(account1) >= amount)
		{
			withdrawFromAccount(account1, amount);
			depositToAccount(account2, amount);
			System.out.println("Successfully transfered");
			return true;
		}
		System.out.println("Insufficient Balance");
		return false;
	}
	
	
	public Customer getCustomerById(String account)
	{
		for (int i = 0; i < bank.getCustomers().length; i++) {
			Customer customer = bank.getCustomers()[i];
				
			if(customer.getAccount().equals(account))
			{
				return customer;
			}
		}
		return null;
	}
}
