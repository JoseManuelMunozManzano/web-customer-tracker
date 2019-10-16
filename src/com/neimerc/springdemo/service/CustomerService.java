package com.neimerc.springdemo.service;

import java.util.List;

import com.neimerc.springdemo.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	
}
