package com.anonymous;
abstract class Car
{
	abstract void price();
	abstract void mileage();
	
}
public class Details {
 public static void main(String[] args)
 {
	 Car bmw=new Car() {

		@Override
		void price() {
			System.out.println("Price of the vehicle is 50000");
			
		}

		@Override
		void mileage() {
			// TODO Auto-generated method stub
			System.out.println("Mileage is 20");
		}
		 
	 };
	 bmw.mileage();
	 bmw.price();
 }
}
