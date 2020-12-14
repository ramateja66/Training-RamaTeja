package com.motivity;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PatientRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String name=request.getParameter("name");
	String emailid=request.getParameter("mail");
	String password=request.getParameter("password");
	int age=Integer.parseInt(request.getParameter("age"));
	int mobile=Integer.parseInt(request.getParameter("mobile"));
	String address=request.getParameter("address");
	PatientBean patient=new PatientBean();
	patient.setName(name);
	patient.setEmailid(emailid);
	patient.setPassword(password);
	patient.setAge(age);
	patient.setMobile(mobile);
	patient.setAddress(address);
	boolean status=false;
	try {
		status=patient.patientRegister(name, password, emailid, age, mobile, address);
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(status==true)
		response.sendRedirect("patient_success.html");
	else
		response.sendRedirect("patient_registration.html?msg=failed");
	
	}

}
