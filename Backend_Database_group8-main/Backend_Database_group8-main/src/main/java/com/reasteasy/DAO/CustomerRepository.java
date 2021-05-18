package com.reasteasy.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reasteasy.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String>{

}
