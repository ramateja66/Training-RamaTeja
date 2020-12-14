package com.company;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LeaveController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String start_date=request.getParameter("start_date");
		String last_date=request.getParameter("end_date");
		HttpSession session=request.getSession();
		int id=(Integer)session.getAttribute("eid");
		LocalDate date1=LocalDate.parse(start_date);
		LocalDate date2=LocalDate.parse(last_date);
		
		long days=ChronoUnit.DAYS.between(date1, date2);
		int remdays=(Integer)session.getAttribute("hodays");
		LeaveBean lb=new LeaveBean();
		boolean status=false;
		if(days<=remdays)
		{
		try {
			status=lb.leaveprocess(id, days);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		if(status)
		{
			session.setAttribute("rem", remdays);
			response.sendRedirect("congo_leave.jsp");
		}
		else
		{
			response.sendRedirect("cancelled.jsp");
		}
		
		
		
	}
}
