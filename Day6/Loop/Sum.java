package com.loop;

public class Sum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int number=134;
		int sum=0,rem;
		while(number>0)
		{
			rem=number%10;
			sum=sum+rem;
			number=number/10;
		}
		System.out.println(sum);
	}

}
