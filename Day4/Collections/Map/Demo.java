package com.map;

import java.util.HashMap;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(101,"kohli");
		map.put(102,"Finch");
		map.put(103,"padikkal");
		map.put(104,"dube");
		map.put(105,"shivan");
		map.put(106,"siraj");
		map.put(107,"morris");
		
		System.out.println(map);
		/* to get the size */
		System.out.println(map.size());
		/* to check empty or not */ 
		System.out.println(map.isEmpty());
		/* to get the value through key */ 
		System.out.println(map.get(103));
		/* to check whether give key isp resent or not */ 
		System.out.println(map.containsKey(200));
		/* to check whether it contains the given value or not */ 
		System.out.println(map.containsValue("dube"));
		/*to remove */ 
		map.remove(103);
		/* to replace the value */ 
		map.replace(107, "chris");
		/* to get the key set */ 
		System.out.println(map.keySet());
		/* to get the pair set */ 
		System.out.println(map.entrySet());
		
		/* put if absent */ 
		map.putIfAbsent(102, "teja");
		HashMap<Integer,String> hash=new HashMap<Integer,String>();
		hash.put(201,"sursh");
		hash.put(202,"ramesh");
		hash.put(203, "kiran");
		/* to add hasg hashmap into map hashmap */ 
		map.putAll(hash);
		/* to clear */ 
		map.clear();
		

	}

}
