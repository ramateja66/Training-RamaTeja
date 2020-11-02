package com.vector;

import java.util.Vector;

public class Demotwo {

	public static void main(String[] args) {
		Vector<String> vv=new Vector<String>();
		vv.add("warner");
		vv.add("kane");
		vv.add("smith");
		vv.add("jason");
		vv.add("rashid");
		Vector<String> cc=new Vector<String>();
		cc.add("bairstow");
		cc.add("bairstow");
	cc.add("khallel");
	cc.add("siraj");
	cc.add("sandeep");
	cc.add("natarajan");
	cc.add("saha");
	/* to add one vector object to another */ 
	vv.addAll(cc);
	/* to remove cc vector from vv */ 
	vv.removeAll(cc);
	/* to rerive particular elelmts */ 
	System.out.println(vv.subList(0 , 2));
	/* to retain all */ 
	vv.retainAll(cc);
	System.out.println(vv);

}}
