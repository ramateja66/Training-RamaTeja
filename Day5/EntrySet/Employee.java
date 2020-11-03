package com.entry;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Employee {

	public static void main(String[] args)
	{
		TreeMap<Integer,String > map=new TreeMap<Integer,String>();
		map.put(102,"Kishore");
		map.put(104,"Abhi");
		map.put(105,"Suraj");
		map.put(108,"Satya");
		map.put(110,"Niraj");
		map.put(112,"Manoj");
		map.put(122,"tiwary");
		map.put(132,"kiran");
		Set entry=map.entrySet();
		Iterator iter=entry.iterator();
		while(iter.hasNext())
		{
			Map.Entry hm=(Map.Entry) iter.next();
			System.out.println(hm.getKey() + "-- " + hm.getValue());
		}
		
		

	}

}
