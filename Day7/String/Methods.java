package com.string;

class Name
{
	void methods()
	{
	String name="MAXWELL";
	/* converts uper case letters to lower case */
	String lower=name.toLowerCase();
	System.out.println(lower);
	/* converts lower case letters to uppercase */ 
	String  upper=name.toUpperCase();
	System.out.println(upper);
	/* to know the length of the string */
	int length=name.length();
	 System.out.println(length);
	String name2="John";
	/* to concat one string to another */ 
	String fullname=name.concat(name2);
	System.out.println(fullname);
	/*To get character of string at specified index */ 
	char ch=fullname.charAt(5);
	System.out.println(ch);
	String name3="MAXWELL";
	int result=name3.compareTo(name);
	System.out.println(result);
	int result1=lower.compareToIgnoreCase(name3);
	System.out.println(result1);
	/*to get the hashcode */
	int code=name.hashCode();
	System.out.println(code);
	String msg="Hello World";
	String msg1=msg.trim();
	System.out.println(msg1);
	/* to convert string to array */
	char[] arr=name.toCharArray();
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}

	/* to replace characters */ 
	System.out.println(name.replace("L","S"));
	System.out.println(name.replaceAll("L","S"));
	/* splitting the string */
	String sentence="Hello-world-programming";
	String[] words=sentence.split("-");
	for(String x:words)
	{
		System.out.println(x);
	}
	/* splitting the string and setting up the limit */ 
	String[] total=sentence.split("-",2);
	for(String x:total)
	{
		System.out.println(x);
	}
	}
}
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name name=new Name();
		name.methods();
	}

}
