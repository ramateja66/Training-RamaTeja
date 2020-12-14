package com.motivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginBean
{
	List<RegistrationBean> al=new ArrayList<RegistrationBean>();
	 String specialist;
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	
	private String emailid;
	private String password;
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public RegistrationBean validateLogin(String emailid,String password) throws SQLException, ClassNotFoundException
	{
		RegistrationBean bbb=new RegistrationBean();
		Connection con=Connectiing.connection();
		String sql="select * from doctor where emailid=? and password=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1,emailid);
		pst.setString(2, password);
		ResultSet set=pst.executeQuery();
		if(set.next())
		{
			bbb.setDoctor_id(set.getInt("doctor_id"));
			bbb.setSpecialist(set.getString("specialist"));
			bbb.setDoctor_name(set.getString("doctor_name"));
			bbb.setMailid(set.getString("emailid"));
			bbb.setAge(set.getInt("age"));
			bbb.setPassword(set.getString("password"));
			bbb.setMobile(set.getInt("mobile"));
			bbb.setCountry(set.getString("nationality"));
			al.add(bbb);
		return bbb;
		}
		else
		{
			return null;
	}
	}	
}
