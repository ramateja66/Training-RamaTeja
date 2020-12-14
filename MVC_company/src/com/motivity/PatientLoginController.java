package com.motivity;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PatientLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String email=request.getParameter("mailid");
		String password=request.getParameter("password");
		PatientLoginBean patientloginbean=new PatientLoginBean();
		HttpSession session=request.getSession();
		session.setAttribute("patient", patientloginbean);
		patientloginbean.setEmail(email);
		patientloginbean.setPassword(password);
		boolean status=false;
		try {
		status=	patientloginbean.patientLogin(email, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
		{
			session.setAttribute("p_id", patientloginbean.pid);
			session.setAttribute("p_name", patientloginbean.pname);
			session.setAttribute("pass", patientloginbean.getPassword());
			session.setAttribute("p_age", patientloginbean.page);
			session.setAttribute("p_mail", patientloginbean.getEmail());
			session.setAttribute("p_mobile", patientloginbean.pmobile);
			session.setAttribute("p_address", patientloginbean.paddress);
			response.sendRedirect("patient_home.html");
		}
		else
		{
			response.sendRedirect("patient_login.html?msg=failed");
		}
	}

	
}
