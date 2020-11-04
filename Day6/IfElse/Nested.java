package com.controlstatements;

class Number
{
	public void display(int number)
	{
		if(number>=10)
		{
			if(number<15)
			{
				System.out.println("Nmber is smaller than 15");
			}
			else if(number<20)
			{
				System.out.println("Number is below 20");
				
			}
		}
			else
			{
				System.out.println("Number is smaller than 10 ");
			}
		}
}
public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number number=new Number();
		number.display(8);

	}

}
