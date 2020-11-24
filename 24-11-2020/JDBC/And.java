package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class And {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/motivity";
		String user="root";
		String password="root";
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first id");
		int id1=sc.nextInt();
		System.out.println("Enter second id");
		int id2=sc.nextInt();
		String qry="Select name,city,salary from employee where id="+id1+"and id="+id2+";";
		System.out.println(qry);
		ResultSet set=stmt.executeQuery(qry);
		while(set.next())
		{
			System.out.println(set.getString(1)+"-"+set.getString(2)+"-"+set.getInt(3));
		}
	}

}
