package com.admin;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Connecting;

@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session=request.getSession();
		String mail=request.getParameter("mail");
		String password=request.getParameter("password");
		Session sf=Connecting.connect();
		Transaction trx=sf.beginTransaction();
		Query qr=sf.createQuery("from Admin a where a.mail=? and a.password=?");
		qr.setParameter(0, mail);
		qr.setParameter(1,password);
		List<Admin> list=qr.list();
		if(list.size()!=0)
		{
			Iterator<Admin> ad=list.iterator();
			while(ad.hasNext())
			{
				Admin admin=ad.next();
				int id=admin.getId();
				session.setAttribute("aid", id );
			}
			
			response.sendRedirect("admin_home.html?msg=successful");
		}
		else
		{
			response.sendRedirect("adminlogin.html?msg=failed");
		}
	}

}
