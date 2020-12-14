package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ManagerRegistrationBean
{
	private String firstname;
	private String lastname;
	private String gender;
	private int salary;
	private int mobile;
	private String address;
	private String password;
	private String mailid;
	private String employeename;
	private String department;
	
	
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
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public boolean register(String firstname,String lastname,String gender,int salary,int mobile,String address,String password,String mailid,String department) throws ClassNotFoundException, SQLException
	{
		Connection con=Connecting.connection();
		String sql="insert into manager(firstname,lastname,mobile,gender,salary,address,password,mailid,department) values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, firstname);
		pst.setString(2, lastname);
		pst.setInt(3, mobile);
		pst.setString(4, gender);
		pst.setInt(5, salary);
		pst.setString(6, address);
		pst.setString(7, password);
		pst.setString(8, mailid);
		pst.setString(9, department);
		int i=pst.executeUpdate();
		if(i!=0)
		return true;
		else
		return false;
	}

}
