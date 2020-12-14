package com.motivity;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/PatientAppointmentController")
public class PatientAppointmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession ss=request.getSession();
		int id=(Integer) ss.getAttribute("p_id");
		String name=request.getParameter("name");
		int mobile=Integer.parseInt(request.getParameter("number"));
		int age=Integer.parseInt(request.getParameter("age"));
		String gender=request.getParameter("gender");
		String specialist=request.getParameter("specialist");
		String date_of_appointment=request.getParameter("date");
		String time=request.getParameter("time");
		String address=request.getParameter("address");
		PatientAppointmentBean patientAppointment=new PatientAppointmentBean();
		patientAppointment.setName(name);
		patientAppointment.setMobile(mobile);
		patientAppointment.setAge(age);
		patientAppointment.setGender(gender);
		patientAppointment.setSpecialist(specialist);
		patientAppointment.setTime(time);
		patientAppointment.setDate_of_appointment(date_of_appointment);
		patientAppointment.setAddress(address);
		boolean status=false;
		try {
			status=patientAppointment.patientAppointment(name, mobile, age, gender, specialist, date_of_appointment, time, address,id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
		{
			response.sendRedirect("patient_home.html?msg=appointment");	
		}
		else
		{
			response.sendRedirect("patient_home.html?msg=Notappointed");
		}
	}

}
