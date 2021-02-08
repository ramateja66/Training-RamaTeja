package com.patterns;
class Phone
{
	private String os;
	private String cname;
	private int price;
	public Phone(String os, String cname, int price) {
		super();
		this.os = os;
		this.cname = cname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", cname=" + cname + ", price=" + price + "]";
	}
	
}
class PhoneBuilder
{
	private String os;
	private String cname;
	private int price;
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setCname(String cname) {
		this.cname = cname;
		return this;
	}
	public PhoneBuilder setPrice(int price) {
		this.price = price;
		return this;
	}
	public Phone getPhone()
	{
		return new Phone(os,cname,price);
	}
}
public class Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p=new PhoneBuilder().setOs("Android").getPhone();
		System.out.println(p.toString());
	}
}
