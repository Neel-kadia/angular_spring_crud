package com.example.CustomerRegistration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CustomerRegistration.model.Customer;
import com.example.CustomerRegistration.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer getCustomerById(int id) {
		Optional < Customer > optional = customerRepository.findById(id);
		Customer customer = null;
		if (optional.isPresent()) {
			customer = optional.get();
		} else {
			throw new RuntimeException ("customer not found for id " + id);
		}
		return customer;
	}

	@Override
	public void deleteCustomerById(int id) {
		customerRepository.deleteById(id);
	}

	@Override
	public boolean existsEmail(String email) {
		return customerRepository.existsByEmail(email);
	}

	@Override
	public boolean existsMobile(String mobile) {
		return customerRepository.existsByMobile(mobile);
	}

	@Override
	public List < Customer > findbyAllOrderByIdDesc() {
		return customerRepository.findAllByOrderByIdDesc();
	}

}