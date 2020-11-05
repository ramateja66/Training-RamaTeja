package com.exceptions;

class Name
{
	void conversion(String name)
	{
		try
		{
		int length=name.length();
		System.out.println(length);
		}
		catch(NullPointerException np)
		{
			np.printStackTrace();
		}
		finally
		{
			System.out.println("Ecxecution Done");
		}
	}
}
public class Null {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Name name=new Name();
		name.conversion(null);
	}

}
