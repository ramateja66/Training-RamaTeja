package com.motivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PatientBean
{
	int id;
	private String name;
	private String password;
	private String emailid;
	private int age;
	private int mobile;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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

	public boolean patientRegister(String name,String password,String emailid,int age,int mobile,String address) throws ClassNotFoundException, SQLException
	{
		Connection con=Connectiing.connection();
		String sql="insert into patientDetails(patient_name,mailid,password,age,mobile,address) values(?,?,?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1,name);
		pst.setString(2, emailid);
		pst.setString(3,password);
		pst.setInt(4, age);
		pst.setInt(5, mobile);
		pst.setString(6,address);
		int i=pst.executeUpdate();
		if(i!=0)
		{
		return true;
		}else
		{
			return false;
	}
	}
	
	
	
}
