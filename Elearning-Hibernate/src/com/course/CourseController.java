package com.course;

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
 * Servlet implementation class CourseController
 */
@WebServlet("/CourseController")
@MultipartConfig(fileSizeThreshold=1024*1024*10,maxFileSize=1024*1024*1000,maxRequestSize=1024*1024*1000)
public class CourseController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sess=request.getSession();
	int aid=	(int) sess.getAttribute("aid");
		PrintWriter writer=response.getWriter();
		Course course=new Course();
		String foldername="resources";
		String uploadpath=request.getServletContext().getRealPath("")+foldername;
		File fi=new File(uploadpath);
		if(!fi.exists()) 
		{
			fi.mkdir();
		}
		Part file=request.getPart("file");
		String name=request.getParameter("name");
		String subject=request.getParameter("subject");
		String filename=file.getSubmittedFileName();
		String path=foldername+File.separator+fi;
		InputStream is=file.getInputStream();
		Files.copy(is, Paths.get(uploadpath+File.separator+filename),StandardCopyOption.REPLACE_EXISTING);
		writer.println(path);
		Session ss=Connecting.connect();
		course.setAid(aid);
		course.setName(name);
		course.setSubject(subject);
		course.setFile(filename);
		course.setPath(path);
		Transaction tr=ss.beginTransaction();
		int i=(int) ss.save(course);
		if(i>0)
		{
			response.sendRedirect("uploaded_successfully.html");
		}
		
		tr.commit();
		ss.close();
		
		
		
		
	}

}
