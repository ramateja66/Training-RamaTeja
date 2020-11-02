package com.staticfactory;

abstract class Calculation
{
	abstract void result();
	abstract void percentage();
}
class Addition extends Calculation
{

	@Override
	void result() {
		// TODO Auto-generated method stub
		System.out.println("Result is 20 ");
		
	}

	@Override
	void percentage() {
		// TODO Auto-generated method stub
		System.out.println("Percentage is 2");
	}
	
}
class Subtraction extends Calculation
{

	@Override
	void result() {
		// TODO Auto-generated method stub
		System.out.println("Result is -503");
		
	}

	@Override
	void percentage() {
		// TODO Auto-generated method stub
		System.out.println("percentage is null");
		
	}
	
}
class Total
{
	static Calculation myCalculation(String name)
	{
		if(name.equalsIgnoreCase("addition"))
		return new Addition();
		else if(name.equalsIgnoreCase("subtraction"))
			return new Subtraction();
		else
			return null;
	}
}
public class Result {

	public static void main(String[] args) {
		
		
		Calculation cal=Total.myCalculation("ADDITION");
		cal.percentage();
		cal.result();

	}

}
