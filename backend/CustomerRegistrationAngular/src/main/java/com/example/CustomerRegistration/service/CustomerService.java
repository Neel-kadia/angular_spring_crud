package com.example.CustomerRegistration.service;

import java.util.List;

import com.example.CustomerRegistration.model.Customer;

public interface CustomerService {

	Customer saveCustomer(Customer customer);
	Customer getCustomerById(int id);
	void deleteCustomerById(int id);
	boolean existsEmail(String email);
	boolean existsMobile(String mobile);
	List < Customer > findbyAllOrderByIdDesc();

}