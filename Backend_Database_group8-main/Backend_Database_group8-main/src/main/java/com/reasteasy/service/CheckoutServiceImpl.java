package com.reasteasy.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reasteasy.DAO.AddressRepository;
import com.reasteasy.DAO.CustomerRepository;
import com.reasteasy.DAO.OrderCustomerRepository;
import com.reasteasy.DAO.OrderItemRepository;
import com.reasteasy.DAO.OrdersRepository;
import com.reasteasy.DAO.ProductRepository;
import com.reasteasy.entity.Address;
import com.reasteasy.entity.Customer;
import com.reasteasy.entity.OrderCustomer;
import com.reasteasy.entity.OrderItem;
import com.reasteasy.entity.Orders;
import com.reasteasy.entity.Product;
@Service
public class CheckoutServiceImpl implements CheckoutService{
	@Autowired
	AddressRepository addressRepository;
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	OrdersRepository ordersRepository;
	@Autowired
	ProductRepository productRepository;
	@Autowired
	OrderItemRepository orderItemRepository;
	@Autowired
	OrderCustomerRepository orderCustomerRepository;
	
	//get all customer from customer table
	@Override
	public List<Customer> findAllCustomer() {
		return customerRepository.findAll();
	}
	
	//save customer to customer table
	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.saveAndFlush(customer);
	}
	
	//get emailId of customer from customer table for validation
	@Override
	public List<Customer> findByEmail(String theEmail) {
		return customerRepository.findAll().stream().filter(x->x.getEmail().equalsIgnoreCase(theEmail)).collect(Collectors.toList());
	}
	
	//get all products from product table
	@Override
	public List<Product> findAllProduct() {
		
		return productRepository.findAll();
	}
	
	//save product to product table
	@Override
	public Product saveProduct(Product theProduct) {
		
		return productRepository.saveAndFlush(theProduct);
	}
	
	//get address from address table
	@Override
	public List<Address> findAllAddress() {
	
		return addressRepository.findAll();
	}
	
	//save address to address table
	@Override
	public Address saveAddress(Address theAddress) {
		
		return addressRepository.saveAndFlush(theAddress);
	}
	
	//get all orders placed by customer from order table
	@Override
	public List<OrderCustomer> findAllOrderCustomer() {
		
		return orderCustomerRepository.findAll();
	}
	
	//save orders of customer to order table
	@Override
	public OrderCustomer saveOrderCustomer(OrderCustomer theorderCustomer) {
		
		return orderCustomerRepository.saveAndFlush(theorderCustomer);
	}
	
	//get all orders from order table
	@Override
	public List<Orders> findAllOrders() {
		
		return ordersRepository.findAll();
	}
	
	//save orders to order table
	@Override
	public Orders saveOrders(Orders theorders) {
		
		return ordersRepository.saveAndFlush(theorders);
	}
	
	//get all order placed by customer from orderItem table
	@Override
	public List<OrderItem> findAllOrderItem() {
		
		return orderItemRepository.findAll();
	}
	
	//save order item placed by customer to orderItem table
	@Override
	public OrderItem saveOrderItem(OrderItem theorderItem) {
		
		return orderItemRepository.saveAndFlush(theorderItem);
	}
	
	

}
