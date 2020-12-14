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

public class ManagerLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session=request.getSession();
		String mailid=request.getParameter("mail");
		String password=request.getParameter("password");
		ManagerLoginBean mgBean=new ManagerLoginBean();
		mgBean.setMailid(mailid);
		mgBean.setPassword(password);
		List<ManagerRegistrationBean> al=new ArrayList<ManagerRegistrationBean>();
		
		try {
			al=mgBean.login(mailid, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(al.size()!=0)
		{	
			session.setAttribute("msd", mgBean.des);
			session.setAttribute("mid", mgBean.id);
			session.setAttribute("listmg",al);
			response.sendRedirect("manager_home.html");
		
		}else
		{
			response.sendRedirect("manager_login.html?msg=failed");
	}
	}
}
