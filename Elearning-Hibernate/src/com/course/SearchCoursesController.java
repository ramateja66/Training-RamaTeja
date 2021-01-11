package com.course;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SearchCoursesController")
public class SearchCoursesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session=request.getSession();
		PrintWriter writer=response.getWriter();
		String subject=request.getParameter("subject");
		Course course=new Course();
		List<Course> li=new ArrayList<Course>();
		li=course.searchCourses(subject);
		if(li.size()!=0)
		{
			session.setAttribute("sub", subject);
			
			response.sendRedirect("allcourses.jsp");
		}	
		else
		{
			response.sendRedirect("student_home.html");
		}
	}
}
