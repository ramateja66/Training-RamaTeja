package com.entry;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String > hash=new HashMap<Integer,String>();
		hash.put(07,"Dhoni");
		hash.put(300,"Murali");
		hash.put(76, "kohli");
		hash.put(78, "Rohit");
		Set<Map.Entry<Integer,String>> hm=hash.entrySet();
		for(Map.Entry<Integer,String> h:hm)
		{
			if(h.getKey()==300)
			{
				System.out.println(h.getValue());
			}
		}

	}

}
