package com.motivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientLoginBean
{
	int pid;
	String pname;
	int page;
	int pmobile;
	String paddress;
	private String email;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean patientLogin(String email,String password) throws ClassNotFoundException, SQLException
	{
		Connection con=Connectiing.connection();
		String sql="select * from patientDetails where mailid=? and password=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, email);
		pst.setString(2, password);
		ResultSet set=pst.executeQuery();
		if(set.next())
		{
			pid=set.getInt(1);
			pname=set.getString(2);
			email=set.getString(3);
			password=set.getString(4);
			page=set.getInt(5);
			pmobile=set.getInt(6);
			paddress=set.getString(7);
			return true;
		}
		else
		{
			return false;
		}
	}

}
