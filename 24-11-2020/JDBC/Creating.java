package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Creating {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/motivity","root", "root");
		if(con!=null)
		{
			System.out.println("Coneection created succesfully");
		}
	}

}
