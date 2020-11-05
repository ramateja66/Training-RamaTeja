package com.exceptions;

class Practice
{
	void exceptions(int num,int num2)
	{
		try {
			int result=num/num2;
			System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
}
public class Arthimetic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice excep=new Practice();
		excep.exceptions(10, 0);

	}

}
