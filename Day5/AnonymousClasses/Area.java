package com.anonymous;

abstract class Quadrilateral
{
	int sides=4;
	int degrees=360;
	abstract void square();
	abstract void circle();
	
}
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Quadrilateral quad=new Quadrilateral() {

			@Override
			void square() {
				System.out.println("Total side is "+sides);
			}

			@Override
			void circle() {
				System.out.println("totlal degrees is "+ degrees);
				
			}
			
		};
		System.out.println(quad);
		quad.circle();
		quad.square();
	}

}
