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
@Table(name="Order_Customer")
public class OrderCustomer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Order_Customer_Id")
	private int Order_Customer_Id;

	@Column(name="First_Name")
	private String firstName;

	@Column(name = "Last_Name")
	private String lastName;

	@Column(name ="Email")
	private String email;



}
