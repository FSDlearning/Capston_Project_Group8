package com.reasteasy.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reasteasy.entity.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer>{

}
