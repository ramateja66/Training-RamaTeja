package com.patterns;
interface Bikes
{
	void topSpeed();
}
class Honda implements Bikes
{

	@Override
	public void topSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Top Speed is 150");
	}
	
}
class Hero implements Bikes
{

	@Override
	public void topSpeed() {
		System.out.println("Top speed is 130");
		
	}
	
}
class Details
{
	public Bikes getInstance(String cname)
	{
		if(cname.equalsIgnoreCase("hero"))
			return new Hero();
		else if(cname.equalsIgnoreCase("honda"))
			return new Honda();
		else
			return null;
	}
}
public class FactoryDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Details dt=new Details();
		Bikes b=dt.getInstance("honda");
		b.topSpeed();
	}

}
