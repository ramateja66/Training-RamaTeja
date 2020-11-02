package com.list;

import java.util.ArrayList;

public class ListDemoTwo {

	public static void main(String[] args)
	{
		/* Creating a arraylist of String type */ 
		ArrayList<String>  al=new ArrayList<String>();
		/*Adding elements into arrayList */
		al.add("Pant");
		al.add("Iyer");
		al.add("Dhawan");
		al.add("Stoinis");
		/* Creating an another arrayList */
		ArrayList<String> bl=new ArrayList<String>();
		bl.add("rohit");
		bl.add("hardik");
		bl.add("krunal");
		bl.add("Warner");
		/* Adding another list into al list */
		al.addAll(bl);
		System.out.println(al);
		/* Adding bl list items into al list from specified index */ 
		bl.addAll(2, al);
		System.out.println(bl);
		/* to remove one arraylist  in another arraylist*/ 
		al.removeAll(bl);
		System.out.println(al);
		/* TO KNOW THE LAST INDEX */ 
		System.out.println(bl.lastIndexOf("Pant"));
		/* to clear an arraylist */
			bl.clear();
			System.out.println(bl.size());
			System.out.println(al);
			

}
}
