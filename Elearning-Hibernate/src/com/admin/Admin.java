package com.admin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Connecting;

public class Admin
{
	private int id;
	private String name;
	private int experience;
	private String subject;
	private String mail;
	private String password;
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<Admin> viewTutors()
	{
		Session sf=Connecting.connect();
		Transaction trx=sf.beginTransaction();
		Query qr=sf.createQuery("from Admin");
		List<Admin> li=qr.list();
		List<Admin> list=new ArrayList<Admin>();
		Iterator<Admin> it=li.iterator();
		while(it.hasNext())
		{
			Admin ad=it.next();
			ad.setName(ad.getName());
			ad.setMail(ad.getMail());
			ad.setSubject(ad.getSubject());
			ad.setExperience(ad.getExperience());
			ad.setStatus(ad.getStatus());
			list.add(ad);
		}
		return list;
		
	}

}
