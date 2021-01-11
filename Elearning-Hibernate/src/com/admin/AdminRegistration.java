package com.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Connecting;

@WebServlet("/AdminRegistration")
public class AdminRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Session ss=Connecting.connect();
		String name=request.getParameter("name");
		String mail=request.getParameter("mail");
		String password=request.getParameter("password");
		int experience=Integer.parseInt(request.getParameter("experience"));
		String subject=request.getParameter("subject");
		Admin admin=new Admin();
		admin.setMail(mail);
		admin.setName(name);
		admin.setPassword(password);
		admin.setExperience(experience);
		admin.setSubject(subject);
		Transaction trx=ss.beginTransaction();
		int i=(int)ss.save(admin);
		if(i>0)
		{
			response.sendRedirect("index.html?mgs=successfully");
		}
		trx.commit();
		ss.close();
		
		
	}

}
