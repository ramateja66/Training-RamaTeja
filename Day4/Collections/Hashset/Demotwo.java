package com.hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demotwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> hash=new LinkedHashSet<String>();
		hash.add("bretlee");
		hash.add("symonds");
		hash.add("gilchrist");
		hash.add("clarke");
		hash.add("michae");
		HashSet<String> hs=new HashSet<String>();
		hs.add("dhoni");
		hs.add("watson");
		hs.add("mohit");
		hs.add("rayudu");
		hs.add("faf");
		/* to hs set into hash set*/ 
		hash.addAll(hs);
		/* to check whther it contains hs set */ 
		System.out.println(hash.containsAll(hs));
		/* to retain all*/
		System.out.println(hash.retainAll(hs));
		System.out.println(hash);
		/* to remove All */ 
		hash.removeAll(hs);

	}

}
