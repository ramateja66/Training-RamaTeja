 package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeLoginBean 
{
	int id;
	int hdays;
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
	
	public List<EmployeeRegistrationBean> login(String mailid,String password) throws ClassNotFoundException, SQLException
	{
		Connection con=Connecting.connection();
		String sql="select * from employee where mailid=? and password=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, mailid);
		pst.setString(2, password);
		ResultSet set=pst.executeQuery();
		List<EmployeeRegistrationBean> registers=new ArrayList<EmployeeRegistrationBean>();
		while(set.next())
		{
			id=set.getInt("id");
			hdays=set.getInt("total_leaves");
			EmployeeRegistrationBean erBean=new EmployeeRegistrationBean();
			erBean.setId(set.getInt("id"));
			erBean.setFirstname(set.getString("firstname"));
			erBean.setLastname(set.getString("lastname"));
			erBean.setAge(set.getInt("age"));
			erBean.setAddress(set.getString("address"));
			erBean.setMobile(set.getInt("mobile"));
			erBean.setDesignation(set.getString("designation"));
			erBean.setMailid(set.getString("mailid"));
			erBean.setTotal_days(set.getInt("total_leaves"));
			registers.add(erBean);
			
		}
		return registers;
	}

}
