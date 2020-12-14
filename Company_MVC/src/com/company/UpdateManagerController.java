package com.company;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UpdateManagerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String mail=request.getParameter("mail");
		String address=request.getParameter("address");
		int mobile=Integer.parseInt(request.getParameter("mobile"));
		int id=(Integer)session.getAttribute("mid");
		
		UpdateManagerBean umg=new UpdateManagerBean();
		boolean status=false;
		
		try {
			status=umg.updateManager(firstname, lastname, address, mobile, mail,id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
			response.sendRedirect("updated_successfully.html");
		else
			response.sendRedirect("update_manager.html?msg=failed");
	}

}
