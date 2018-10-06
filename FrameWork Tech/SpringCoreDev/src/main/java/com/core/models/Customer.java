package com.core.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//By default bean name is de-capitalize name of the class but if you want any modification on this need to use below: 
//@Component("customer1")

// @Component()	// Just because we have used @Configuration in the Bank class so that will provide the customer instance
public class Customer {
	
	private int customerId;
	private String customerName;
	
	//@Qualifier("address1")	// This will also not be able to resolve the same autowiring ambiguity problem and @Qualifier is not valid for constructor
	private Address address;
	
	
	// We need to use this to get the default value when we are not passing the setter methods to set the fields value
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	//@Autowired	// Because if you qualify the field but how about the constructor level, hence, in this case will go with setter method
	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	// Constructor already has been declared above, hence, we don't need the setter methods.
	
	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public Address getAddress() {
		return address;
	}
	
	// This will solve the problem of autowiring by name 
	@Autowired
	@Qualifier("address1")
	public void setAddress(Address address) {
		this.address = address;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	

}
