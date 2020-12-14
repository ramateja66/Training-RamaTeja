package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateManagerBean
{
	private String firstname;
	private String lastname;
	private String address;
	private int mobile;
	private String mail;
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
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public boolean updateManager(String firstname,String lastname,String address,int mobile,String mail,int id) throws ClassNotFoundException, SQLException
	{
		Connection con=Connecting.connection();
		String sql="update manager set firstname=?,lastname=?,mobile=?,address=?,mailid=? where id=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, firstname);
		pst.setString(2,lastname);
		pst.setInt(3,mobile);
		pst.setString(4, address);
		pst.setString(5, mail);
		pst.setInt(6, id);
		int i=pst.executeUpdate();
		if(i!=0)
			return true;
		else
			return false;
		
	}

}
