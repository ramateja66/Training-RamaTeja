package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("Do u want to retrieve maximum salary details or minimum salary details options (maximum/minimum)");
		String option=sc.next();
		if(option.equalsIgnoreCase("maximum"))
		{
			String qry="Select id,name,city,max(salary) from employee";
			Statement stmt=con.createStatement();
			ResultSet set=stmt.executeQuery(qry);
			while(set.next())
			{
				System.out.println(set.getInt(1)+"-"+set.getString(2)+"-"+set.getString(3)+"-"+set.getInt(4));
			}
		}
	}

}
