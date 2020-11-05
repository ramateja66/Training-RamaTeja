package com.exceptions;

class Found
{
	void notFound()
	{
		try
		{
			System.out.println("Hello");
		Class.forName("Oracle.jdbc.drive.OracleDriver");
	}
		catch(ClassNotFoundException exp)
		{
			
			exp.printStackTrace();
		}
		finally
		{
			System.out.println("Welcome");
		}
	}
	
}
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Found found=new Found();
		found.notFound();

	}

}
