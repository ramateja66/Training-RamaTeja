package com.vector;

import java.util.Vector;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vv=new Vector<String>();
		/* to get the size of vector */ 
		System.out.println(vv.size());
		/* to check whteher it is empty or not	 */
		System.out.println(vv.isEmpty());
		/* to add the objects */ 
		vv.add("Gill");
		vv.add("shubam");
		vv.add("gayle");
		vv.add("varun");
		vv.add("ram");
		vv.add("ishan");
		vv.add("kishan" );
		vv.add("rohit");
		vv.add("pandya");
		/* to know the index */ 
		System.out.println(vv.indexOf("rohit"));
		System.out.println(vv.lastIndexOf("ram"));
		/* to get object at specified index */ 
		System.out.println(vv.elementAt(4)); 
		/* to knnow the first elelmtn and last elelmt */ 
		System.out.println(vv.firstElement());
		System.out.println(vv.lastElement());
		/* to add elemtn */ 
		vv.addElement("teja");
		/* to remeove element and remove elemnt at specied index  */ 
		vv.remove(0);
		vv.removeElementAt(2);
		
		/* to get the element of given index */ 
		vv.get(0);
		/* to set the element at specified index */ 
		vv.set(4, "dinesh");

	}

}
