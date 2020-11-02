package com.list;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		/* To add objects into an Array List */ 
		al.add(10);
		al.add(20);
		al.add(45);
		al.add(8);
		al.add(10);
		al.add(4);
		al.add(3);
		System.out.println(al);
		/* To find size of the arrayList */
		System.out.println(al.size());
		/* To check whether the array list is empty or not */ 
		System.out.println(al.isEmpty());
		/* To check whether array list contains object or not */ 
		System.out.println(al.contains(8));
		/* To remove particular object from the specified index */ 
		System.out.println(al.remove(2));
		System.out.println(al);
		/* To get particular object from speciified index */ 
		System.out.println(al.get(2));
		/* TO set the object in specified index */ 
		al.set(0, 30);
		System.out.println(al);
		/* To get the hashcode of arrayList  */
		System.out.println(al.hashCode());
		/* To get index of object */ 
		System.out.println(al.indexOf(10));
		/* To get sublist */ 
		System.out.println(al.subList(2, 5));
		

	}

}
