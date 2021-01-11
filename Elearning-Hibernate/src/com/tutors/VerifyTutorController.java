package com.tutors;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.admin.Admin;
import com.connect.Connecting;

/**
 * Servlet implementation class VerifyTutorController
 */
@WebServlet("/VerifyTutorController")
public class VerifyTutorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerifyTutorController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		VerifyTutorController vtc=new VerifyTutorController();
		vtc.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Admin aa=new Admin();
		String name,mail,password,subject;
		int experience;
		int id=Integer.parseInt(request.getParameter("id"));
		Session ss=Connecting.connect();
		Transaction trx=ss.beginTransaction();
		Query qr=ss.createQuery("from Tutors where id=?");
		qr.setParameter(0, id);
		List<Tutors> list=qr.list();
		Iterator<Tutors> it=list.iterator();
		while(it.hasNext())
		{
			
			Tutors tt=it.next();
			aa.setName(tt.getName());
			aa.setMail(tt.getMail());
			aa.setExperience(tt.getExperience());
			aa.setSubject(tt.getSubject());
			aa.setPassword(tt.getPassword());
			
		}
		int i=(int) ss.save(aa);
		if(i>0)
		{
			Query qry=ss.createQuery("update Tutors t set t.status='verified' where t.id=?");
			qry.setParameter(0, id);
			qry.executeUpdate();
			response.sendRedirect("appliedTutors.jsp?msg=successfully");
		}
		trx.commit();
		ss.close();
	}

}
