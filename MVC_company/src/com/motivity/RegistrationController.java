package com.motivity;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String doctor_name=request.getParameter("name");
		String password=request.getParameter("password");
		String mail=request.getParameter("mail");
		int age=Integer.parseInt(request.getParameter("age"));
		String country=request.getParameter("nationality");
		int mobile=Integer.parseInt(request.getParameter("mobile"));
		String specialist=request.getParameter("specialist");
		RegistrationBean register=new RegistrationBean();
		register.setDoctor_name(doctor_name);
		register.setPassword(password);
		register.setMailid(mail);
		register.setAge(age);
		register.setSpecialist(specialist);
		register.setCountry(country);
		register.setMobile(mobile);
		HttpSession session=request.getSession();
		session.setAttribute("registerBean",register);
		boolean status=false;
		try {
			status=register.registration(doctor_name, password, mail, mobile, specialist, age, country);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
		{
			response.sendRedirect("registration_success.html");
		}
		else
		{
			response.sendRedirect("doctor_registration.html?msg=failed");
		}
	}

}
