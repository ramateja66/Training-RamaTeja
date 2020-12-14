package com.motivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ViewAppointments
{
	private String doctor;
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}


	private String name;
	private int id;
	private String status;
	private String date;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public List<ViewAppointments> view(int id) throws ClassNotFoundException, SQLException
	{
		Connection con=Connectiing.connection();
		String sql="select * from appointment where pdid=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, id);
		ResultSet set=pst.executeQuery();
		ArrayList<ViewAppointments> view_list=new ArrayList();
		while(set.next())
		{
			ViewAppointments apoint=new ViewAppointments();
			apoint.setName(set.getString("name"));
			apoint.setStatus(set.getString("status"));
			apoint.setDate(set.getString("date_of_appointment"));
			apoint.setDoctor(set.getString("doctorname"));
			view_list.add(apoint);
		}
		return view_list;
	}

}
