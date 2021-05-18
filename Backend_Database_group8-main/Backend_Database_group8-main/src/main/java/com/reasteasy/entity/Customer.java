package com.reasteasy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Customer")
public class Customer {
	@Id
	@Column(name = "Email")
	private String email;

	@Column(name="First_Name")
	private String firstName;

	@Column(name = "Last_Name")
	private String lastName;

	@Column(name ="Password")
	private String password;






}
