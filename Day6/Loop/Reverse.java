package com.loop;

public class Reverse {

	public static void main(String[] args) 
	{
		int number=658;
		int sum=0;
		while(number>0)
		{
			int rem=number%10;
			 sum=sum*10+rem;
			number=number/10;
		
		}
		System.out.println(sum);

	}

}


