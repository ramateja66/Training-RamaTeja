package com.tutors;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Connecting;

/**
 * Servlet implementation class TutorsRegistrations
 */
@WebServlet("/TutorsRegistrations")
@MultipartConfig(fileSizeThreshold=1024*1024*10,maxFileSize=1024*1024*1000,maxRequestSize=1024*1024*100)
public class TutorsRegistrations extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		PrintWriter writer=response.getWriter();
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String mail=request.getParameter("mail");
		int experience=Integer.parseInt(request.getParameter("experience"));
		String subject=request.getParameter("subject");
		String foldername="resources";
		String uploadpath=request.getServletContext().getRealPath("")+foldername;
		File fi=new File(uploadpath);
		if(!fi.exists())
		{
			fi.mkdir();
		}
		Part file=request.getPart("file");
		String resume=file.getSubmittedFileName();
		String path=foldername+File.separator+fi;
		InputStream is=file.getInputStream();
		Files.copy(is,Paths.get(uploadpath+File.separator+resume),StandardCopyOption.REPLACE_EXISTING);
		writer.println(path);
		Session ss=Connecting.connect();
		Tutors tut=new Tutors();
		Transaction trx=ss.beginTransaction();
		tut.setName(name);
		tut.setPassword(password);
		tut.setMail(mail);
		tut.setExperience(experience);
		tut.setResume(resume);
		tut.setSubject(subject);
		tut.setPath(path);
		int i=(int) ss.save(tut);
		if(i>0)
		{
			
			response.sendRedirect("adminRegistration.html?msg=successfully");
		}
		trx.commit();
		ss.close();
		
	}

}
