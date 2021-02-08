package com.patterns;

class Single
{
	private static Single single=null;
	private Single()
	{
		
	}
	public static Single getSingle()
	{
		if(single==null)
		return single=new Single();
		else
			return single;
	}
}
public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single s=Single.getSingle();
		System.out.println(s.hashCode());
		Single ss=Single.getSingle();
		System.out.println(ss.hashCode());

	}

}
