package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LeaveBean
{
	private int id;
	 int rem_days;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean leaveprocess(int id,long days) throws ClassNotFoundException, SQLException
	{
		Connection con=Connecting.connection();
		String sql="update employee set total_leaves=total_leaves-? where id=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setLong(1, days);
		pst.setInt(2, id);
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
