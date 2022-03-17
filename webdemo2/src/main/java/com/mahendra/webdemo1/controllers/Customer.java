package com.mahendra.webdemo1.controllers;

public class Customer {
	private int custId;
	private String firstName;
	private String lastName;
	private String phone;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int custId, String firstName, String lastName, String phone) {
		super();
		this.custId = custId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}
	
}
