package com.exceptions;

class Out
{
	public static void alphabet(char[] ch)
	{
		try {
			char c=ch[10];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Completed");
		}
	}
}
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch= {'a','a','a','c','d'};
		Out.alphabet(ch);
	}

}
