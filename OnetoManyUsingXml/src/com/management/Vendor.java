package com.management;

import java.util.Set;

public class Vendor 
{
	private int id;
	private String name;
	private Set customer;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set getCustomer() {
		return customer;
	}
	public void setCustomer(Set customer) {
		this.customer = customer;
	}

}
