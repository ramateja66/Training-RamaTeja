package com.loop;

public class Individual {

	public static void main(String[] args)
	{
		int number=145;
		int sum=0,rem;
		int fact=1;
		while(number > 0)
		{
			rem=number%10;
			fact=1;
			while(rem>0)
			{
				fact=fact*rem;
				rem--;
			}
			sum=sum+fact;
			number=number/10;
		}
		System.out.println(sum);
	}

}
