package com.rest;

import org.springframework.data.repository.CrudRepository;

import com.rest.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String > {

}
