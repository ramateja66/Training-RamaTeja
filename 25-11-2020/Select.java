package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/motivity";
		String user="root";
		String pass="root";
		Connection con=DriverManager.getConnection(url, user, pass);
		if(con!=null)
		{
			System.out.println("Connection established");
		}
	}

}
