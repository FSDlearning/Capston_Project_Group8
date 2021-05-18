package com.reasteasy.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reasteasy.entity.OrderCustomer;


public interface OrderCustomerRepository extends JpaRepository<OrderCustomer, Integer> {

}
