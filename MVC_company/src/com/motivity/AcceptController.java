package com.motivity;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AcceptController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession hs=request.getSession();
		String name=(String)hs.getAttribute("name");
		int id=Integer.parseInt(request.getParameter("id"));
		boolean status=false;
		AcceptBean bb=new AcceptBean();
			try {
				status=bb.accept(name,id);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		if(status)
			response.sendRedirect("appointment.jsp");
		else 
			response.sendRedirect("patient_home.html");
	}

		
		
		
		
	}