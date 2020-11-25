 package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/motivity";
		String user="root";
		String password="root";
		Connection con=DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt=con.prepareStatement("delete from employee where id=?;");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		pstmt.setInt(1, id);
		int i=pstmt.executeUpdate();
		if(i==1)
		{
			System.out.println("Record deleted successfully");
		}
		else
		{
			System.out.println("Not deleted");
		}
		
	}
}
