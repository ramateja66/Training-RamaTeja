<%@ page import="com.motivity.RegistrationBean" %>
<%@ page import="com.motivity.LoginBean" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<body bgcolor="grey" align="center">
<table border="2" align="center">
<tr>
<th>Id</th>
<th>Name</th>
<th>Password</th>
<th>Email</th>
<th>Mobile</th>
<th>Specialist</th>
<th>Age</th>
<th>Nationality</th>
<th>Action</th>
</tr>
<% 
RegistrationBean bean=(RegistrationBean)session.getAttribute("doctor_details");

%>
<tr>
<td><%=bean.getDoctor_id()%></td>
<td><%=bean.getDoctor_name()%></td>
<td><%=bean.getPassword()%></td>
<td><%=bean.getMailid()%></td>
<td><%=bean.getMobile()%></td>
<td><%=bean.getSpecialist()%></td>
<td><%=bean.getCountry()%></td>
<td><%=bean.getCountry() %></td>
<td><a href="update_doctor.jsp">Update</a></td>
</tr>
</table>
<h5><a href="doctor_home.html">Home</a></h5>
<h5><a href="doctor_profile.jsp">Profile</a></h5>
<h5><a href="viewAppointment.jsp">Appointments</a></h5>
<h5><a href="doctor_login.html">Logout</a></h5>
</body>
</html>