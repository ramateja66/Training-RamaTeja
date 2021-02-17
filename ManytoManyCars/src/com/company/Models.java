package com.company;

import java.util.Set;

public class Models
{
	private int m_id;
	private String model_name;
	private Set manufacturer;
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public Set getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(Set manufacturer) {
		this.manufacturer = manufacturer;
	}
	

}
