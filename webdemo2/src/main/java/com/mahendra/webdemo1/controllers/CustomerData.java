package com.mahendra.webdemo1.controllers;

import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class CustomerData {
	
	private List<Customer> customers = new LinkedList<>();
	
	public CustomerData() {
		customers.add(new Customer(101,"Vladmir","Putin","465635365"));
		customers.add(new Customer(102,"Joe","Biden","676635365"));
	}
	
	public List<Customer> getCustomers(){
		return customers;
	}
	
	public void add(Customer cu) {
		customers.add(cu);
	}
}
