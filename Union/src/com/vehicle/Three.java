package com.vehicle;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="three")
public class Three extends Vehicle
{
	private int totalwheels;

	public int getTotalwheels() {
		return totalwheels;
	}

	public void setTotalwheels(int totalwheels) {
		this.totalwheels = totalwheels;
	}
	
	

}
