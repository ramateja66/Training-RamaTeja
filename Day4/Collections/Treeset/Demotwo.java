package com.treeset;

import java.util.TreeSet;

public class Demotwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(10);
		set.add(12);
		set.add(15);
		
		set.add(18);
		set.add(17);
		set.add(19);
		set.add(25);
		set.add(24);
		
		/* to get the lower elemt mentioned */ 
		System.out.println(set.lower(17));
		/* to get the Higher elemt mentioned */ 
		System.out.println(set.higher(24));
		/* display the first object and deletes it */ 
		System.out.println(set.pollFirst());
		System.out.println(set);
		/* display the last object and deletes it */ 
		System.out.println(set.pollLast());
		System.out.println(set);
	}

}
