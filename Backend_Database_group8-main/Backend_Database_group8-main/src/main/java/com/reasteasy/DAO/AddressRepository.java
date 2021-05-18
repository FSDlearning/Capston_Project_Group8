package com.reasteasy.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reasteasy.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
