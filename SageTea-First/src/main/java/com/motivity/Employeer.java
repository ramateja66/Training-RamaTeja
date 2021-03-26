package com.motivity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Employeer
{
/*	public Employeer(String er_name, String designation) {
		super();
		this.er_name = er_name;
		this.designation = designation;
	}*/
	@Id
	@Column(name="er_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int er_id;
	@Column(name="er_name")
	private String er_name;
	@Column(name="designation")
	private String designation;
	public int getEr_id() {
		return er_id;
	}
	public void setEr_id(int er_id) {
		this.er_id = er_id;
	}
	public String getEr_name() {
		return er_name;
	}
	public void setEr_name(String er_name) {
		this.er_name = er_name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
