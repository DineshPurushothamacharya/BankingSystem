package com.greatlearning.model;

public class Customer {

	private String name;
	private String account;
	private String password;
	private double balance;
	
	public Customer(String name, String account) {
		this.balance = 1000.0;
		this.name = name;
		this.account = account;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return this.account;
	}

}
