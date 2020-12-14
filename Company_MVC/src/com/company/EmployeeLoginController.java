package com.company;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmployeeLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeRegistrationBean erB=new EmployeeRegistrationBean();
		String mailid=request.getParameter("mail");
		String password=request.getParameter("password");
		EmployeeLoginBean empBean=new EmployeeLoginBean();
		empBean.setMailid(mailid);
		empBean.setPassword(password);
		HttpSession sess=request.getSession();
		sess.setAttribute("eBean", empBean);
		List<EmployeeRegistrationBean> al=new ArrayList<EmployeeRegistrationBean>();
		try {
			al=empBean.login(mailid, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(al.size()!=0)
		{
			sess.setAttribute("hodays", empBean.hdays);
			sess.setAttribute("des", erB.getDesignation());
			sess.setAttribute("ename",erB.getMailid());
			sess.setAttribute("list", al);
			sess.setAttribute("eid", empBean.id);
			response.sendRedirect("employee_home.html");
		}
		else
		{
			response.sendRedirect("index.html?msg=failed");
		}
	}

}
