package com.company;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmployeeRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String mailid=request.getParameter("mail");
		int age=Integer.parseInt(request.getParameter("age"));
		String gender=request.getParameter("gender");
		int salary=Integer.parseInt(request.getParameter("salary"));
		String designation=request.getParameter("designation");
		int mobile=Integer.parseInt(request.getParameter("mobile"));
		String address=request.getParameter("address");
		String password=request.getParameter("password");
		EmployeeRegistrationBean employeeBean=new EmployeeRegistrationBean();
		employeeBean.setFirstname(firstname);
		employeeBean.setLastname(lastname);
		employeeBean.setMailid(mailid);
		employeeBean.setAge(age);
		employeeBean.setGender(gender);
		employeeBean.setSalary(salary);
		employeeBean.setDesignation(designation);
		employeeBean.setMobile(mobile);
		employeeBean.setAddress(address);
		employeeBean.setPassword(password);
		boolean status=false;
		try {
			status=employeeBean.register(firstname, lastname, age, gender, salary, designation, mobile, address, password, mailid);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
			response.sendRedirect("registered_successfully.html?msg=success");
		else
			response.sendRedirect("employee_registration.html?msg=failed");
	}

}
