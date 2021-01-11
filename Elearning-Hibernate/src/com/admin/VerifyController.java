package com.admin;

import java.io.IOException;
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
 * Servlet implementation class VerifyController
 */
@WebServlet("/VerifyController")
public class VerifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		VerifyController vc=new VerifyController();
		vc.doPost(request, response);
	
	}
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Session sf=Connecting.connect();
		Transaction trx=sf.beginTransaction();
		int id=Integer.parseInt(request.getParameter("id"));
		Query qr=sf.createQuery("update Admin a set a.status='verified' where a.id=?");
		
		qr.setParameter(0,id);
		int i=qr.executeUpdate();
		if(i>0)
		{
			response.sendRedirect("appliedTutors.jsp?msg=Successfully");
		}
		trx.commit();
		sf.close();
	}

}
