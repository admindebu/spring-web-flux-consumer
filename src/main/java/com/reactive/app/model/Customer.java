package com.reactive.app.model;



public class Customer {
	
	private Long customerId;
	
	private String customerName;
	
	private CustomerGender customerGender;
	
	
	public enum CustomerGender{
		MALE,
		FEMALE
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public CustomerGender getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(CustomerGender customerGender) {
		this.customerGender = customerGender;
	}

	public Customer(Long customerId, String customerName, CustomerGender customerGender) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerGender = customerGender;
	}

	public Customer() {
	}

	@Override
	public String toString() {
		return "Customer{" +
				"customerId=" + customerId +
				", customerName='" + customerName + '\'' +
				", customerGender=" + customerGender +
				'}';
	}
}
