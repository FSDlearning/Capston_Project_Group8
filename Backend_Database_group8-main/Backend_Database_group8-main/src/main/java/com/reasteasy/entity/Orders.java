package com.reasteasy.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Orders")
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Order_Id")
	private int orderId;

	@Column(name="Total_Quantity")
	private int totalQuantity;

	@Column(name = "Total_Price")
	private double totalPrice;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name ="Order_Customer_Id")
	private OrderCustomer orderCustomer;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name ="Address_Id")
	private Address address;



}
