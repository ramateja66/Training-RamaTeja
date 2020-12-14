package com.company;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ManagerRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String mailid=request.getParameter("mail");
		String gender=request.getParameter("gender");
		int salary=Integer.parseInt(request.getParameter("salary"));
		String department=request.getParameter("designation");
		int mobile=Integer.parseInt(request.getParameter("mobile"));
		String address=request.getParameter("address");
		String password=request.getParameter("password");
	ManagerRegistrationBean mrBean=new ManagerRegistrationBean();
				mrBean.setFirstname(firstname);
				mrBean.setLastname(lastname);
				mrBean.setMailid(mailid);
				mrBean.setGender(gender);
				mrBean.setSalary(salary);
				mrBean.setDepartment(department);
				mrBean.setMobile(mobile);
				mrBean.setAddress(address);
				mrBean.setPassword(password);
				boolean status=false;
				try {
					status=mrBean.register(firstname, lastname, gender, salary, mobile, address, password, mailid, department);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(status)
					response.sendRedirect("registered_successfully.html?msg=registered");
				else
					response.sendRedirect("manager_registration.html?msg=Unsuccess");
	}

}
