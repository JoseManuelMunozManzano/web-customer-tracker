package com.neimerc.springdemo.dao;

import java.util.List;

import com.neimerc.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);	
	
}
