package com.company;

import java.util.Set;

public class Manufacturer
{
	private int id;
	private String name;
	private Set models;
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
	public Set getModels() {
		return models;
	}
	public void setModels(Set models) {
		this.models = models;
	}
	

}
