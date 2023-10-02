package com.ejemplo.springjackson.repository;

import com.ejemplo.springjackson.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
