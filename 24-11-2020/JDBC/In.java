package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class In {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String pass="root";
		Connection con=DriverManager.getConnection(url,username,pass);
		Statement stmt=con.createStatement();
		System.out.println("Enter the marks marks to upadate ");
		int bonus=sc.nextInt();
		String qry="update student set marks=marks+"+bonus+" where id in (1,2);";
		System.out.println(qry);
		int i=stmt.executeUpdate(qry);
		if(i>0)
		{
			System.out.println("updated succesfully");
		}
		else
		{
			System.out.println("no");
		}
		
		

	}

}
