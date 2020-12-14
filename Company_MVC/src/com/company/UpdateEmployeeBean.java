package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEmployeeBean 
{
	private String firstname;
	private String lastname;
	private String address;
	private int age;
	private int mobile;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	
	public boolean update(String firstname,String lastname,String address,int age,int mobile,String mailid,int id) throws ClassNotFoundException, SQLException
	{
		Connection con=Connecting.connection();
		String sql="update employee set firstname=?,lastname=?,address=?,mobile=?,age=?,mailid=? where id=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, firstname);
		pst.setString(2,lastname);
		pst.setString(3, address);
		pst.setInt(4, mobile);
		pst.setInt(5, age);
		pst.setString(6,mailid);
		pst.setInt(7,id);
		int i=pst.executeUpdate();
		if(i!=0)
			return true;
		else
			return false;
	}

}
