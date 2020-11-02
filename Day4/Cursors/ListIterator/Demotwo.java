package com.listIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demotwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("faf");
		list.add("du plesiis");
		list.add("watson");
		list.add("dhoni");
		list.add("raina");
		list.add("khallel");
		ListIterator<String> iter=list.listIterator();
		/* Displaying objects in forward way */
		while(iter.hasNext())
			System.out.println(iter.next());
		/* Displaying elements in reverse way */ 
		while(iter.hasPrevious())
			System.out.println(iter.previous());
		
	}

}
