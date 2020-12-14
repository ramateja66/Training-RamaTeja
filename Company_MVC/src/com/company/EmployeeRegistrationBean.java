package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeRegistrationBean 
{
	private int id;
	private String firstname;
	private String lastname;
	private int age;
	private String gender;
	private int salary;
	private String designation;
	private int mobile;
	private String address;
	private String password;
	private String mailid;
	private int total_days;

	public int getTotal_days() {
		return total_days;
	}
	public void setTotal_days(int total_days) {
		this.total_days = total_days;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public boolean register(String firstname,String lastname,int age,String gender,int salary,String designation,int mobile,String address,String password,String mailid) throws ClassNotFoundException, SQLException
	{
		Connection con=Connecting.connection();
		String sql="insert into employee(firstname,lastname,age,gender,salary,designation,mobile,address,password,mailid) values (?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, firstname);
		pst.setString(2, lastname);
		pst.setInt(3, age);
		pst.setString(4, gender);
		pst.setInt(5, salary);
		pst.setString(6, designation);
		pst.setInt(7, mobile);
		pst.setString(8, address);
		pst.setString(9,password);
		pst.setString(10,mailid);
		int i=pst.executeUpdate();
		if(i!=0)
			return true;
		else
		return false;
	}
	
}
