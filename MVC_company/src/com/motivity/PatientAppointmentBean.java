package com.motivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class PatientAppointmentBean
{
	private String name;
	private int mobile;
	private int age;
	private String gender;
	private String specialist;
	private String date_of_appointment;
	private String time;
	private String address;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public String  getDate_of_appointment() {
		return date_of_appointment;
	}
	public void setDate_of_appointment(String date_of_appointment) {
		this.date_of_appointment = date_of_appointment;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean patientAppointment(String name,int mobile,int age,String gender,String specialist,String date_of_appointment,String time,String address,int id) throws SQLException, ClassNotFoundException
		{
		Connection con=Connectiing.connection();
		String sql="insert into appointment(name,mobile,age,gender,specialist,date_of_appointment,time,address,pdid) values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, name);
		pst.setInt(2, mobile);
		pst.setInt(3, age);
		pst.setString(4, gender);
		pst.setString(5, specialist);
		pst.setString(6, date_of_appointment);
		pst.setString(7, time);
		pst.setString(8, address);
		pst.setInt(9, id);
		int i=pst.executeUpdate();
		if(i!=0)
			return true;
		else
		return false;
	}
	

}
