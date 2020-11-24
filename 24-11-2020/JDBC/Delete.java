package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,username,password);
		int value;
		Statement stmt=con.createStatement();
		System.out.println("Select id,salary,city,name to delete record");
		String option=sc.next();
		if(option.equalsIgnoreCase("id"))
		{
			System.out.println("Enter the id you want to delete");
			value=sc.nextInt();
			String qry="delete from employee where id="+value+";";
			int i=stmt.executeUpdate(qry);
			if(i==1)
			System.out.println("Deleted successfully");
			else
				System.out.println("Not deleted");
			
		}
		else if(option.equalsIgnoreCase("salary"))
		{
			System.out.println("Enter the salary you want to delete");
			value=sc.nextInt();
			String qry="delete from employee where salary="+value+";";
			int i=stmt.executeUpdate(qry);
			if(i==1)
			System.out.println("Deleted successfully");
			else
				System.out.println("Not deleted");
		}
		else if(option.equalsIgnoreCase("name"))
		{
			System.out.println("Enter the name you want to delete");
			String val=sc.next();
			String qry="delete from employee where name='"+val+"';";
			int i=stmt.executeUpdate(qry);
			if(i==1)
			System.out.println("Deleted successfully");
			else
				System.out.println("Not deleted");
		}
		else if(option.equalsIgnoreCase("city"))
		{
			System.out.println("Enter the city name");
			String val=sc.next();
			String qry="delete from employee where city='"+val+"';";
			int i=stmt.executeUpdate(qry);
			if(i==1)
			System.out.println("Deleted successfully");
			else
				System.out.println("Not deleted");
		}
	 
	}

}
