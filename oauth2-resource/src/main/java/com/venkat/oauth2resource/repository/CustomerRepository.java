package com.venkat.oauth2resource.repository;

import com.venkat.oauth2resource.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {

}
