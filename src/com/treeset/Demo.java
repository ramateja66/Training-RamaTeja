package com.treeset;

import java.util.TreeSet;

public class Demo {

	public static void main(String[] args)
	{
		TreeSet<String> set=new TreeSet<String>();
		set.add("gayle");
		set.add("pooran");
		set.add("nicholas");
		set.add("shubam");
		/* to get the size */ 
		System.out.println(set.size());
		/* to check empty or not
		 */
		System.out.println(set.isEmpty());
		/* to get the first element */ 
		System.out.println(set.first());
		/* to get the last */ 
		System.out.println(set.last());
		System.out.println(set);
	}

}
