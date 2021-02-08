package com.patterns;

import java.util.ArrayList;
import java.util.List;

class Book
{
	private int bookid;
	private String bname;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bname=" + bname + "]";
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
}
class BookShop implements Cloneable
{
	private String shopName;
	List<Book> bb=new ArrayList<Book>();
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBb() {
		return bb;
	}
	public void setBb(List<Book> bb) {
		this.bb = bb;
	}
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", bb=" + bb + "]";
	}
	
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookShop shop=new BookShop();
		for(Book b:this.getBb())
		{
			shop.getBb().add(b);
		}
		return shop;
	}
	public void loadData()
	{
		for(int i=1;i<5;i++)
		{
			Book oo=new Book();
			oo.setBookid(i);
			oo.setBname("book"+i);
			getBb().add(oo);
		}
	}
	
}
public class Prototype {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		// TODO Auto-generated method stub
		BookShop bb=new BookShop();
		bb.setShopName("ion");
		bb.loadData();
		
		BookShop bb1=(BookShop) bb.clone();
		bb.getBb().remove(3);
		bb1.setShopName("mars");
		System.out.println(bb);
		System.out.println(bb1);
	}

}
