package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Customer;
import com.rest.service.CustomerService;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomer();
	}
	@RequestMapping(value="/add", method= RequestMethod.POST)
	public void addCustomer(Customer customer) {
		customerService.addCustomer(customer);
	}
	
	@RequestMapping(value="/customer",method=RequestMethod.GET )
	public Customer getCustomer(@RequestParam(value="id") long id) {
		
		return customerService.findCustomer(id);
	}

}
