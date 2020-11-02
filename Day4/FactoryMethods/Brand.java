package com.staticfactory;

abstract class Vehicle
{
	abstract void topSpeed();
	abstract void bestColour();
}

class Audi extends Vehicle
{

	@Override
	void topSpeed() {
		System.out.println("Top speed is 240");
		
	}

	void bestColour() {
		System.out.println("Best colour is Black");
	}
	
}
class Benz extends Vehicle
{

	@Override
	void topSpeed() {
		System.out.println("Top speed is 150 ");
		
	}

	@Override
	void bestColour() {
		System.out.println("Best color is Orange");
		
	}
	
}
class CarFactory
{
	 Vehicle myVehicle(String name)
	{
		if(name.equalsIgnoreCase("Audi"))
		{
			return new Audi();
		}
		else if(name.equalsIgnoreCase("Benz"))
		{
		return new Benz();
		}
		else 
			return null;
	}
}
public class Brand {

	public static void main(String[] args) {
		CarFactory factory=new CarFactory();
		Vehicle veh=factory.myVehicle("Audi");
		veh.bestColour();
		veh.topSpeed();
	}

}
