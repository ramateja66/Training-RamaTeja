package com.vehicle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Four")
public class Four extends Vehicle
{
	@Column(name="totalwheels")
	private int totalweels;

	public int getTotalweels() {
		return totalweels;
	}

	public void setTotalweels(int totalweels) {
		this.totalweels = totalweels;
	}
	

}
