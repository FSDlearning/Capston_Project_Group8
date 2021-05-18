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

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Order_Item")
public class OrderItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Order_Item_Id")
	private int orderItemId;

	@Column(name = "Quantity")
	private double quantity;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name ="Product_Id")
	private Product product;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name ="Order_Id")
	private Orders orders;
}
