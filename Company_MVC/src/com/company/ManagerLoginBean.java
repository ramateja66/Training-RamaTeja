package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ManagerLoginBean
{
	String des;
	int id;
	private String mailid;
	private String password;
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<ManagerRegistrationBean> login(String mailid,String password) throws ClassNotFoundException, SQLException 
	{	
		List<ManagerRegistrationBean> al=new ArrayList<ManagerRegistrationBean>();
		Connection con=Connecting.connection();
		String sql="select * from manager where mailid=? and password=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1,mailid);
		pst.setString(2, password);
		ResultSet set=pst.executeQuery();
		while(set.next())
		{
			id=set.getInt("id");
			des=set.getString("department");
			ManagerRegistrationBean mgBean=new ManagerRegistrationBean();
			mgBean.setFirstname(set.getString("firstname"));
			mgBean.setLastname(set.getString("lastname"));
			mgBean.setAddress(set.getString("address"));
			mgBean.setMailid(set.getString("mailid"));
			mgBean.setMobile(set.getInt("mobile"));
			al.add(mgBean);
		}
			return al;
		
		}

}
