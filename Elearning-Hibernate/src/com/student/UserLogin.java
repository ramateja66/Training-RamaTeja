package com.student;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

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

@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session=request.getSession();
		Session sf=Connecting.connect();
		String mail=request.getParameter("mail");
		String password=request.getParameter("password");
		Transaction trx=sf.beginTransaction();
		String sql="from Student s where s.email=? and s.password=?";
		Query qr=sf.createQuery(sql);
		qr.setParameter(0, mail);
		qr.setParameter(1, password);
		List<Student> st=qr.list();
		if(st.size()!=0)
		{
			Iterator<Student> it=st.iterator();
			while(it.hasNext())
			{
				Student student=it.next();
				int id=student.getId();
				session.setAttribute("id",id);
			}
			response.sendRedirect("student_home.html");
		}else {
			response.sendRedirect("userlogin.html?msg=failed");
	}
	}
	

}
