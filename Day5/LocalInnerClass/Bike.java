package com.local;

class Hero
{
	int price=5000;
	void modelName()
	{
		class Zmr 
		{
			void price()
			{
				System.out.println("Cost of the price is "+ price);
			}
			void topSpeed()
			{
				System.out.println("top speed is 200");
			}
		}
		Zmr zmr=new Zmr();
		zmr.price();
		zmr.topSpeed();
	}
	void mopid()
	{
		class Active
		{
			int price=20000;
			void activePrice()
			
			{
				System.out.println("Price is "+price);
			}
			
		}
		Active act=new Active();
		act.activePrice();
	}
}
public class Bike {

	public static void main(String[] args)
	{
		Hero bike=new Hero();
		bike.modelName();
		bike.mopid();
		
	}

}
