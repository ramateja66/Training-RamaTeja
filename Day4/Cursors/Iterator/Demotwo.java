package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Demotwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		list.add("ravi");
		list.add("king");
		list.add("queen");
		list.add("army");
		list.add("police");
		list.add("people");
		list.add("kids");
		list.add("children");
		Iterator<String> iter=list.iterator();
		while(iter.hasNext())
		{
			String name=(String) iter.next();
			if(name.equalsIgnoreCase("king"))
				iter.remove();
			else
				System.out.println(name);
			
		}

	}

}
