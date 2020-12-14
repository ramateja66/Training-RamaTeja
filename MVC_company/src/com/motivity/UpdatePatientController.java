package com.motivity;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UpdatePatientController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String patient_name=request.getParameter("name");
		String email=request.getParameter("mail");
		int age=Integer.parseInt(request.getParameter("age"));
		int mobile=Integer.parseInt(request.getParameter("mobile"));
		String address=request.getParameter("address");
		HttpSession session=request.getSession();
		int id=(Integer)session.getAttribute("p_id");
		UpdatePatientBean upBean=new UpdatePatientBean();
		upBean.setPatient_name(patient_name);
		upBean.setEmail(email);
		upBean.setAge(age);
		upBean.setAddress(address);
		upBean.setMobile(mobile);
		boolean status=false;
		try {
			status=upBean.updatePatient(patient_name, email, age, mobile, address, id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
			response.sendRedirect("updated_doctor.html");
		else
			response.sendRedirect("updated_patient.html?msg=failed");
		
	}

}
