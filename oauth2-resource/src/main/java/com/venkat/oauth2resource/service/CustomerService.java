package com.venkat.oauth2resource.service;

import com.venkat.oauth2resource.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);
    Customer fetchById(int profileId);
    List<Customer> fetchAllProfiles();
}
