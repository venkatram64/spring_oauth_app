package com.venkat.oauth2resource.service;

import com.venkat.oauth2resource.model.Customer;
import com.venkat.oauth2resource.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;


    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer fetchById(int profileId) {
        Optional<Customer> customer = customerRepository.findById(profileId);
        if (customer.isPresent()) {
            return customer.get();
        } else {
            return null;
        }
    }

    @Override
    public List<Customer> fetchAllProfiles() {
        return customerRepository.findAll();
    }
}