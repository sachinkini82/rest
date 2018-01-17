package com.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.CustomerRepository;
import com.rest.model.Customer;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomer(){
	 List<Customer> customers = new ArrayList<>();
	 customerRepository.findAll().forEach(customers::add);
	 return customers;
	}
	
	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	public Customer findCustomer(long id) {
		return customerRepository.findOne(id);
	}
	
}
