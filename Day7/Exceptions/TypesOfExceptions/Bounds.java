package com.exceptions;

class Alphabets
{
	void indexOutOfBound(String name)
	{
		try
		{
			char ch=name.charAt(10);
			System.out.println(ch);
			System.out.println("Welcome");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Hello");
		}
	}
}
public class Bounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alphabets alpha=new Alphabets();
		alpha.indexOutOfBound("ELEPHAntTiger");

	}

}
