package com.tutors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Connecting;

public class Tutors 
{
	private String status;
	private int id;
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
		private String name;
		private String mail;
		private String password;
		private int experience;
		private String subject;
		private String resume;
		private String path;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
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
		public int getExperience() {
			return experience;
		}
		public void setExperience(int experience) {
			this.experience = experience;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public String getResume() {
			return resume;
		}
		public void setResume(String resume) {
			this.resume = resume;
		}
		public String getPath() {
			return path;
		}
		public void setPath(String path) {
			this.path = path;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		
		public List<Tutors> viewTutors()
		{
			
			ArrayList<Tutors> li=new ArrayList<Tutors>();
			Session ss=Connecting.connect();
			Transaction trx=ss.beginTransaction();
			Query qr=ss.createQuery("from Tutors where status is null");
			List<Tutors> list=qr.list();
			Iterator<Tutors> it=list.iterator();
			while(it.hasNext())
			{
				Tutors tut=it.next();
				tut.setName(tut.getName());
				tut.setMail(tut.getMail());
				tut.setSubject(tut.getSubject());
				tut.setResume(tut.getResume());
				tut.setExperience(tut.getExperience());
				tut.setStatus(tut.getStatus());
				li.add(tut);
			}
			return li;
		}
		
}
