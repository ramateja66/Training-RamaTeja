package com.motivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AcceptBean
{
		private String name,status;
		private int id;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public boolean accept(String name,int id) throws ClassNotFoundException, SQLException {
			Connection con=Connectiing.connection();
			PreparedStatement ps=con.prepareStatement("update appointment set status=?,doctorname=? where id=?");
			ps.setString(1,"accepted");
			ps.setString(2, name);
			ps.setInt(3, id);
			int x=ps.executeUpdate();
			if(x!=0)
				return true;
			else
				return false;
		}

		
		
		


}
