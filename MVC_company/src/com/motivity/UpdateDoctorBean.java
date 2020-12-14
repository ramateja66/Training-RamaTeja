package com.motivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDoctorBean
{
	private String doctor_name;
	private String password;
	private String mailid;
	private int mobile;
	private String specialist;
	private int age;
	private String country;
	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
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
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public boolean update(String doctor_name,String mailid,int mobile,String specialist,int age,String country,int id) throws  SQLException, ClassNotFoundException
	{
		Connection con=Connectiing.connection();
		String sql="update doctor set doctor_name=?,emailid=?,mobile=?,specialist=?,age=?,nationality=? where doctor_id=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, doctor_name);		
		pst.setString(2, mailid);
		pst.setInt(3,mobile);
		pst.setString(4, specialist);
		pst.setInt(5,age);
		pst.setString(6,country);
		pst.setInt(7, id);
		int i=pst.executeUpdate();
		if(i!=0)
		{
		return true;
		}
		else
		{
			return false;
	}
	}
}
