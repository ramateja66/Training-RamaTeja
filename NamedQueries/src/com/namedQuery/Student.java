package com.namedQuery;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries(
{
	@NamedQuery(
	
		name= "findmployee",
		query="from Student s where id=:x"
	)
})
@Entity
@Table(name="employee")
public class Student 
{
	private int id;
	private String email;
	private int password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	

}
