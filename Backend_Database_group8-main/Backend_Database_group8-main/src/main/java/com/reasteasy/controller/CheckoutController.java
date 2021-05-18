package com.reasteasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reasteasy.entity.Address;
import com.reasteasy.entity.Customer;
import com.reasteasy.entity.OrderCustomer;
import com.reasteasy.entity.OrderItem;
import com.reasteasy.entity.Orders;
import com.reasteasy.entity.Product;
import com.reasteasy.service.CheckoutServiceImpl;


@CrossOrigin
@RestController
@RequestMapping("/")
public class CheckoutController {

	@Autowired
	CheckoutServiceImpl checkoutService;


	@GetMapping("/customers")
	public List<Customer> findAllCustomer(){
		return checkoutService.findAllCustomer();
	}

	@PostMapping("/customers")
	public Customer saveCustomer(@RequestBody Customer theCustomer) {
		checkoutService.saveCustomer(theCustomer);
		return theCustomer;
	}

	@GetMapping("/getCustomerByEmail/{email}")
	public List<Customer> getCustomerByEmail(@PathVariable String email)
	{
		return checkoutService.findByEmail(email);
	}


	@GetMapping("/products")
	public List<Product> findAllProduct(){
		return checkoutService.findAllProduct();
	}

	@PostMapping("/products")
	public Product saveProduct(@RequestBody Product theProduct) {
		checkoutService.saveProduct(theProduct);
		return theProduct;
	}

	@GetMapping("/address")
	public List<Address> findAllAddress(){
		return checkoutService.findAllAddress();
	}

	@PostMapping("/address")
	public Address saveAddress(@RequestBody Address address) {
		checkoutService.saveAddress(address);
		return address;
	}

	@GetMapping("/orderCustomers")
	public List<OrderCustomer> findAllOrderCustomer(){
		return checkoutService.findAllOrderCustomer();
	}

	@PostMapping("/orderCustomers")
	public OrderCustomer saveOrderCustomers(@RequestBody OrderCustomer theorderCustomers) {
		checkoutService.saveOrderCustomer( theorderCustomers);
		return theorderCustomers;
	}

	@GetMapping("/orders")
	public List<Orders> findAllOrders(){

		return checkoutService.findAllOrders();
	}

	@PostMapping("/orders")
	public Orders saveOrders(@RequestBody Orders theOrders) {
		checkoutService.saveOrders(theOrders);
		return theOrders;
	}


	@GetMapping("/orderItem")
	public List<OrderItem> findAllOrderItem(){
		return checkoutService.findAllOrderItem();
	}

	@PostMapping("/orderItem")
	public OrderItem saveOrderItem(@RequestBody OrderItem theOrderItem) {
		checkoutService.saveOrderItem(theOrderItem);
		return theOrderItem;
	}
}
