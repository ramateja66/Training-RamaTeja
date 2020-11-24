package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Join {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String pass="root";
		Connection con=DriverManager.getConnection(url, username, pass);
		Statement stmt=con.createStatement();
		String qry="select s.name,s.marks,s.section,i.area,i.mobile from student as s join information as i on i.id=s.id;";
		ResultSet set=stmt.executeQuery(qry);
		while(set.next())
		{
			System.out.println(set.getString(1)+"--"+set.getInt(2)+"--"+set.getString(3)+"--"+set.getString(4)+"--"+set.getInt(5));
		}
	}

}
