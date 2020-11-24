package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/motivity";
		String user="root";
		String password="root";
		Connection con=DriverManager.getConnection(url, user, password);
		System.out.println("Enter the amount of salary you want to add");
		int salary=sc.nextInt();
		System.out.println("Enter the  employees id want to add");
		int id=sc.nextInt();
		String qry="update employee set salary=salary+? where id=?";
		PreparedStatement stmt=con.prepareStatement(qry);
		stmt.setInt(1, salary);
		stmt.setInt(2,id);
		int i=stmt.executeUpdate();
		if(i==1)
		{
			System.out.println("table updated successfully");
		}
		else
		{
			System.out.println("Table not updated successfully");
		}
		}

}
