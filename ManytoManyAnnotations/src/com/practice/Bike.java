package com.practice;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Bike
{
	@Id
	@Column(name="id")
	private int id;
	@Column(name="company_name")
	private String company_name;
	@Column(name="price")
	private int price;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="cid",referencedColumnName="id")
	private Set<Model> models;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Set<Model> getModels() {
		return models;
	}
	public void setModels(Set<Model> models) {
		this.models = models;
	}
	

}
