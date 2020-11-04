package com.loop;

public class Pattern3 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i,j,a=-1,b=1,sum=0;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				sum=a+b;
				a=b;
				b=sum;
				System.out.print(sum + " ");
			}
			System.out.println();
		}
		
	}

}
