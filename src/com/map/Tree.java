package com.map;

import java.util.TreeMap;

public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(524,"english");
		map.put(563,"physics" );
		map.put(246,"biology");
		map.put(986, "sanskrit");
		/* to check whether key is present or not */ 
		System.out.println(map.containsKey(263));
		/* to check whether vale is present or not */ 
		System.out.println(map.containsValue("kins"));
		/* to remove */ 
		map.remove(246);
		/* to check whether it is rmpty or not */
		System.out.println(map.isEmpty());
		/* to get the size */ 
		System.out.println(map.size());
		/* to get the key set */
		System.out.println(map.keySet());
		/* to replace */ 
		map.replace(563, "urdu");
		System.out.println(map);
		/* to clear */ 
		map.clear();
		
	}

}
