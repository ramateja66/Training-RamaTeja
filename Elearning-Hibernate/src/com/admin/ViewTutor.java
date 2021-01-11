package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;

import com.connect.Connecting;

/**
 * Servlet implementation class ViewTutor
 */
@WebServlet("/ViewTutor")
public class ViewTutor extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sess=request.getSession();
		int id=Integer.parseInt(request.getParameter("id"));
		Admin admin=new Admin();
		Session ss=Connecting.connect();
		Query qr=ss.createQuery("from Admin a where a.id=?");
		qr.setParameter(0, id);
		List<Admin> li=qr.list();
		if(li.size()!=0)
		{
			sess.setAttribute("list",li);
			response.sendRedirect("viewtutordetails.jsp");
		}
	}

}
