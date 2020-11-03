package com.staticinner;

 class Branches
{
	static int totalSeats=60;
	static class Electrical
	{
		int fees=2000;
		void admission()
		{
			System.out.println("total available seats in Electrical Department are "+ totalSeats);
		}
		void feesDetails()
		{
			System.out.println("Admission fees in electrical are  "+fees);
		}
	}
	static class Electronics
	{
		int fees=3000;
		void seatsAvailability()
		{
			System.out.println("total Seats Available in Electronics are "+totalSeats);
		}
		void feeDetails()
		{
			System.out.println("Fees in electronics " + fees);
		}
	}
}
public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Branches.Electrical elec=new Branches.Electrical();
		elec.admission();
		elec.feesDetails();
		Branches.Electronics ece=new Branches.Electronics();
		ece.seatsAvailability();
		ece.feeDetails();

	}

}
