package com.practice;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Model
{
	@Id
	@Column(name="cid")
	private int cid;
	@Column(name="model_name")
	private String model_name;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="bike_model")
	@JoinColumn(name="id",referencedColumnName="cid")
	private Set<Bike> bike;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public Set<Bike> getBike() {
		return bike;
	}
	public void setBike(Set<Bike> bike) {
		this.bike = bike;
	}
	
	
	

}
