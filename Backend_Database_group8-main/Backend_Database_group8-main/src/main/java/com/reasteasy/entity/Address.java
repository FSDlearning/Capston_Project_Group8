package com.reasteasy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Address_Id")
	private int addressId;

	@Column(name="City")
	private String city;

	@Column(name = "Country")
	private String country;

	@Column(name ="State")
	private String state;


	@Column(name ="Street")
	private String street;

	@Column(name ="Zip_Code")
	private String zipCode;






}
