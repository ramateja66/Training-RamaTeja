package com.loop;

public class ForLoop3 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int sum=0;
		for(int n=123,rem;n>0;rem=n%10,sum=sum+rem,n=n/10);
		System.out.println(sum);
	}

}
