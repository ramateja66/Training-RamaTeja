package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/motivity";
		String user="root";
		String pass="root";
		Connection con=DriverManager.getConnection(url,user,pass);
		PreparedStatement pstmt=con.prepareStatement("insert into employee values (?,?,?,?);");
		System.out.println("Enter records to be inserted");
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter id");
		int id=ss.nextInt();
		System.out.println("Enter name");
		String name=ss.next();
		System.out.println("enter Salary");
		int salary=ss.nextInt();
		System.out.println("Enter City");
		String city=ss.next();
		pstmt.setInt(1, id);
		pstmt.setNString(2, name);
		pstmt.setInt(3, salary);
		pstmt.setString(4, city);
		int i=pstmt.executeUpdate();
		if(i==0)
		{
			System.out.println("Records not entereed");
		}
		else
		{
			System.out.println("Records entered successfully");
		}
		
	}

}
