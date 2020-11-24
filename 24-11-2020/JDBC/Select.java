package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/motivity";
		String user="root";
		String password="root";
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		String qry="Select * from employee;";
		ResultSet set=stmt.executeQuery(qry);
		while(set.next())
		{
			System.out.println(set.getInt(1)+" --"+set.getString(2)+"--"+set.getInt(3)+"--"+set.getString(4));
		}

	}

}
