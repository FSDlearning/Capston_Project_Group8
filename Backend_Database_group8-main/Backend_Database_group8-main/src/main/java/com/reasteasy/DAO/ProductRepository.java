package com.reasteasy.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reasteasy.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
