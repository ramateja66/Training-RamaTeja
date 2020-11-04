package com.controlstatements;

class Food
{
	public String foodType(String animal_name)
	{
		if(animal_name.equalsIgnoreCase("Tiger"))
		{
			return "Eats Meat";	
		}
		else if(animal_name.equalsIgnoreCase("Monkey"))
		{
		return "Eats Banana";
		}
		else if(animal_name.equalsIgnoreCase("Cat"))
		{
			return "Drinks Milk";
		}
		else 
			return "No Food";
		
	}
}
public class Animals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food fd=new Food();
		System.out.println(fd.foodType("CAt"));
		System.out.println(fd.foodType("Elephant"));
		System.out.println(fd.foodType("Monkey"));

	}

}
