package com.student;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.connect.Connecting;

@WebServlet("/UserInsert")
public class UserInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Session ss=Connecting.connect();
		String name=request.getParameter("name");
		String email=request.getParameter("mail");
		String password=request.getParameter("password");
		Student student=new Student();
		student.setName(name);
		student.setEmail(email);
		student.setPassword(password);
		Transaction tr=ss.beginTransaction();
		int i=(int) ss.save(student);
		if(i>0)
			response.sendRedirect("stregisteredsuccessfully.html?msg=registered");
		else
			response.sendRedirect("studentregister.html?msg=failed");
		tr.commit();
		ss.close();
	
		
	}

}
