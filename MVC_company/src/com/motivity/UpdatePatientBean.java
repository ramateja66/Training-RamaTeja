package com.motivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatePatientBean
{
	private String patient_name;
	private String email;
	private int age;
	private int mobile;
	private String address;
	
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	
	public boolean updatePatient(String patient_name,String email,int age,int mobile,String address,int id) throws ClassNotFoundException, SQLException 
	{
		Connection con=Connectiing.connection();
		String sql="update patientDetails set patient_name=?,mailid=?,age=?,mobile=?,address=? where id=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, patient_name);
		pst.setString(2, email);
		pst.setInt(3, age);
		pst.setInt(4, mobile);
		pst.setString(5, address);
		pst.setInt(6, id);
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
