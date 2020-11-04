package com.loop;

public class ForLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=143;i>0;i--)
		{
			int rem=i%10;
			sum=sum+rem;
			i=i/10;
			
		}
		System.out.println(sum);
	}

}
