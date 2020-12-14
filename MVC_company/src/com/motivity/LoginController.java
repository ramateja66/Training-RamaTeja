package com.motivity;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RegistrationBean bean=null;
		String emailid=request.getParameter("mailid");
		String password=request.getParameter("password");
		LoginBean lgBean=new LoginBean();
		lgBean.setEmailid(emailid);
		lgBean.setPassword(password);
		HttpSession session=request.getSession();
		try {
			
		bean=lgBean.validateLogin(emailid, password);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(bean!=null)
		{
			session.setAttribute("spec", bean.getSpecialist());
			session.setAttribute("doctor_details",bean);
			session.setAttribute("name", bean.getDoctor_name());
			response.sendRedirect("doctor_home.html");
		}
		else
		{
			response.sendRedirect("doctor_login.html?msg=failed");
		}
	}

}
