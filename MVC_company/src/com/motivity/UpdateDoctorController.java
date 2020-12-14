package com.motivity;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UpdateDoctorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		int id=(Integer)session.getAttribute("id");
		String name=request.getParameter("name");
		String mail=request.getParameter("mail");
		int mobile=Integer.parseInt(request.getParameter("mobile"));
		String specialist=request.getParameter("specialist");
		int age=Integer.parseInt(request.getParameter("age"));
		String country=request.getParameter("nationality");
		UpdateDoctorBean update=new UpdateDoctorBean();
		boolean status=false;
		try {
			status=update.update(name, mail, mobile, specialist, age, country,id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
		{
			response.sendRedirect("updated_doctor.html");
		}
		else
		{
			response.sendRedirect("update_doctor.html?msg=failed");
		}
		
		
		
	}

}
