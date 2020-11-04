package com.controlstatements;

class Integer
{
	public void num(int num)
	{
		if(num>0)
		{
			System.out.println("Number is a positive integer");
		}
		else
		{
			System.out.println("It is a negative number");
		}
	}
}
public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer numb =new Integer();
		numb.num(-12);
	}

}
