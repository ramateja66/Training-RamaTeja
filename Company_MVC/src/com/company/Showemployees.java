package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Showemployees 
{
	
	private String firstname;
	private String lastname;
	private String gender;
	private int salary;
	private String address;
	private String mailid;
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	private int number;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public List<Showemployees> view(String specialist) throws ClassNotFoundException, SQLException
	{
		ArrayList<Showemployees> al=new ArrayList();
		Connection con=Connecting.connection();
		String sql="select * from employee where designation=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, specialist);
		ResultSet set=pst.executeQuery();
		while(set.next())
		{
			Showemployees emp=new Showemployees();
			emp.setFirstname(set.getString("firstname"));
			emp.setLastname(set.getString("lastname"));
			emp.setGender(set.getString("gender"));
			emp.setMailid(set.getString("mailid"));
			emp.setSalary(set.getInt("salary"));
			emp.setAddress(set.getString("address"));
			emp.setNumber(set.getInt("mobile"));
			al.add(emp);
		}
		return al;
	}

}
