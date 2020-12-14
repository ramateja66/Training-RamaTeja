package com.company;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UpdateEmployeeController")
public class UpdateEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session=request.getSession();
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String address=request.getParameter("address");
		int mobile=Integer.parseInt(request.getParameter("mobile"));
		int age=Integer.parseInt(request.getParameter("age"));
		String mailid=request.getParameter("mail");
		EmployeeRegistrationBean employee=new EmployeeRegistrationBean();
		int id=(Integer)session.getAttribute("eid");
		UpdateEmployeeBean update=new UpdateEmployeeBean();
		update.setFirstname(firstname);
		update.setLastname(lastname);
		update.setAddress(address);
		update.setMobile(mobile);
		update.setAge(age);
		update.setMailid(mailid);
		boolean status=false;
		try {
			status=update.update(firstname, lastname, address, age, mobile, mailid, id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
			response.sendRedirect("updated_successfully.html");
		else
			response.sendRedirect("update_employee.html?msg=failed");
	}

}
