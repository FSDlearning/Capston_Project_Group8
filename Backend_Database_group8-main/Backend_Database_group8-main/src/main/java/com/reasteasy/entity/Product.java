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
@Table(name="Product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Product_Id")
	private int productId;

	@Column(name="Resturant_Name")
	private String resturantName;

	@Column(name = "Price")
	private String price;

	@Column(name ="Image_Url")
	private String imageUrl;


	@Column(name ="Product_Name")
	private String productName;



}
