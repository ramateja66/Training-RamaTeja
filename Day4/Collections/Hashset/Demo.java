package com.hashset;


import java.util.HashSet;

public class Demo {

	public static void main(String[] args)
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("dhoni");
		hs.add("watson");
		hs.add("mohit");
		hs.add("rayudu");
		hs.add("faf");
		/* to get the size */ 
		System.out.println(hs.size());
		/* to check whether it is empty or not */ 
		System.out.println(hs.isEmpty());
		/* to remove */ 
		hs.remove("watson");
		/* to get the hashcodr*/ 
		System.out.println(hs.hashCode());
		 /* to clear the the hashset */ 
		hs.clear();
		
	}

}
