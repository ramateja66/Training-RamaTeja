package com.motivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DoctorAppointmentBean
{
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String specialist;
	private String name;
	private int mobile;
	private int age;
	private String gender;
	private String status;
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	
	public List<DoctorAppointmentBean> viewAppointments(String specialist) throws ClassNotFoundException, SQLException
	{
			Connection con=Connectiing.connection();
			PreparedStatement ps=con.prepareStatement("select * from appointment where specialist=?");
			ps.setString(1, specialist);
			ResultSet set=ps.executeQuery();
			ArrayList<DoctorAppointmentBean> al=new ArrayList<>();
			while(set.next())
			{
			DoctorAppointmentBean bbb=new DoctorAppointmentBean();
			bbb.setId(set.getInt("id"));
			bbb.setName(set.getString("name"));
			bbb.setAge(set.getInt("age"));
			bbb.setMobile(set.getInt("mobile"));
			bbb.setGender(set.getString("gender"));
			bbb.setStatus(set.getString("status"));
			al.add(bbb);
		}
		return al;
	}

}
