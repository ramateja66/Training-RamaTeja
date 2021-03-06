package com.tutors;

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
 * Servlet implementation class DeletController
 */
@WebServlet("/DeletController")
public class DeletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DeletController dc=new DeletController();
		dc.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session sf=Connecting.connect();
		Transaction trx=sf.beginTransaction();
		Query qr=sf.createQuery("delete from Tutors a where a.id=?");
		int id=Integer.parseInt(request.getParameter("id"));
		qr.setParameter(0, id);
		int i=qr.executeUpdate();
		if(i>0)
		{
			response.sendRedirect("appliedTutors.jsp?msg=Succesfullydeleted");
		}
		trx.commit();
		sf.close();
	}

}
