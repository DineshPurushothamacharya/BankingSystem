package com.greatlearning.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {

	private String name;
	private String ifsc;
	private String address;
	private Customer[] customers = new Customer[10];
	
	public Bank(String name, String ifsc, String address) {
		super();
		this.name = name;
		this.ifsc = ifsc;
		this.address = address;
	}


	public String getName() {
		return this.name;
	}


	public String getIfsc() {
		return ifsc;
	}


	public String getAddress() {
		return address;
	}
	
	public void addCustomers(Customer customer, int index)
	{
		customers[index] = customer;
	}
	

	public Customer[] getCustomers() {
		return customers;
	}


	@Override
	public String toString() {
		return this.name;
	}

}
