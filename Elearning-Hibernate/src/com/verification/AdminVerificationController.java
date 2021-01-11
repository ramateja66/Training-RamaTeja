package com.verification;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Connecting;

/**
 * Servlet implementation class AdminVerificationController
 */
@WebServlet("/AdminVerificationController")
public class AdminVerificationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String mail=request.getParameter("mail");
		String password=request.getParameter("password");
		AdminVerification verification=new AdminVerification();
		Session sf=Connecting.connect();
		Transaction trx=sf.beginTransaction();
		Query qr=sf.createQuery("from AdminVerification a where a.mail=? and a.password=?");
		qr.setParameter(0, mail);
		qr.setParameter(1, password);
		List<AdminVerification> li=qr.list();
		if(li.size()!=0)
		{
			response.sendRedirect("verified_home.html?msg=successfully");
		}
		
		
		
	}

}
