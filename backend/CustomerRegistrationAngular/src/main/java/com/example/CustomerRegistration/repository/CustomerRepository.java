package com.example.CustomerRegistration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CustomerRegistration.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository < Customer, Integer > {

	public boolean existsByEmail(String email);
	public boolean existsByMobile(String mobile);
	List < Customer > findAllByOrderByIdDesc();

}