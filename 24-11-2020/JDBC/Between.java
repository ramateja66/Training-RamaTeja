package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Between {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement stmt=con.createStatement();
		System.out.println("Enter the two ids");
		int id=sc.nextInt();
		int id2=sc.nextInt();
		String qry="select * from employee where id between "+id+" and "+id2+";";
		ResultSet set=stmt.executeQuery(qry);
		while(set.next())
		{
			System.out.println(set.getInt(1)+"-"+set.getString(2)+"-"+set.getInt(3)+"-"+set.getString(4));
		}
	}

}
