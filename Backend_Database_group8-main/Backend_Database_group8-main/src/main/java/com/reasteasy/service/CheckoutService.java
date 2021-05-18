package com.reasteasy.service;

import java.util.List;
import java.util.Optional;

import com.reasteasy.entity.Address;
import com.reasteasy.entity.Customer;
import com.reasteasy.entity.OrderCustomer;
import com.reasteasy.entity.OrderItem;
import com.reasteasy.entity.Orders;
import com.reasteasy.entity.Product;


public interface CheckoutService {


	public List<Customer> findAllCustomer();
	public Customer saveCustomer(Customer customer);
	public List<Customer> findByEmail(String theEmail);

	public List<Product> findAllProduct();
	public Product saveProduct(Product theProduct);

	public List<Address> findAllAddress();
	public Address saveAddress(Address theAddress);

	public List<OrderCustomer> findAllOrderCustomer();
	public OrderCustomer saveOrderCustomer(OrderCustomer theorderCustomer);

	public List<Orders> findAllOrders();
	public Orders saveOrders(Orders theorders);

	public List<OrderItem> findAllOrderItem();
	public OrderItem saveOrderItem(OrderItem theorderItem);




}