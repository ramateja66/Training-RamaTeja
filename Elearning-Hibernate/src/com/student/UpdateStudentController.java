package com.student;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Connecting;

/**
 * Servlet implementation class UpdateStudentController
 */
@WebServlet("/UpdateStudentController")
public class UpdateStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Session ss=Connecting.connect();
		String name=request.getParameter("name");
		String email=request.getParameter("mail");
		String password=request.getParameter("password");
		HttpSession sess=request.getSession();
		int id=(int) sess.getAttribute("id");
		Student student=new Student();
		Query qr=ss.createQuery("update Student s set s.name=?,s.email=?,s.password=? where s.id=?");
		qr.setParameter(0, name);
		qr.setParameter(1, email);
		qr.setParameter(2,password);
		qr.setParameter(3, id);
		Transaction trx=ss.beginTransaction();
		int mod=qr.executeUpdate();
		if(mod>0)
		{
			response.sendRedirect("student_home.html?msg=updatedSuccessfully");
		}
		else
		{
			response.sendRedirect("updateStudent.html?msg=failed");
		}
		trx.commit();
		ss.close();
	
	}

}
