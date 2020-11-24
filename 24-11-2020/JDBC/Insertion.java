package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/motivity";
		String user="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,user,password);
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter employee id");
			int id=sc.nextInt();
			System.out.println("Enter employee name");
			String name=sc.next();
			System.out.println("Enter employee salary");
			int salary=sc.nextInt();
			System.out.println("Enter employee city");
			String  city=sc.next();
			String qry="insert into employee values ("+id+",'"+name+"',"+salary+",'"+city+"');";
			Statement stmt=con.createStatement();
			int i=stmt.executeUpdate(qry);
			if(i==1)
			{
				System.out.println("Inserted successfully");
			}
			else
			{
				System.out.println("Not inserted");
			}
			System.out.println(qry);
			System.out.println("Do you want to enter more records(Yes/No)");
			String option=sc.next();
			if(option.equalsIgnoreCase("no"))
			{
				break;
			}
			
		}
	}

}
