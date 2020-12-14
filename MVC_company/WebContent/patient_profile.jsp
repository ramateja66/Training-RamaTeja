<%@ include file="connect.jsp" %>
<%@ page import="com.motivity.PatientLoginBean" %>
<!DOCTYPE html>
<html>
<body bgcolor="grey" align="center">
<table border="2" align="center">
<tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Password</th>
<th>Age</th>
<th>Mobile</th>
<th>Address</th>
<th>Action</th>
</tr>
<% 
PatientLoginBean bean=(PatientLoginBean)session.getAttribute("patient");
int id=(Integer)session.getAttribute("p_id");
String name=(String)session.getAttribute("p_name");
String password=(String)session.getAttribute("pass");
String mail=(String)session.getAttribute("p_mail");
int age=(Integer)session.getAttribute("p_age");
int mobile=(Integer)session.getAttribute("p_mobile");
String address=(String)session.getAttribute("p_address");

%>

<tr>
<td><%=id%></td>
<td><%=name%></td>
<td><%=mail%></td>
<td><%=password%></td>
<td><%=age%></td>
<td><%=mobile%></td>
<td><%=address%></td>
<td><a href="update_patient.html">Update</a></td>
</tr>

</table>
<h5><a href="patient_home.html">Home</a></h5>
<h5><a href="patient_profile.jsp">Profile</a></h5>
<h5><a href="patient_appointment.jsp">Appointments</a></h5>
<h5><a href="patient_login.html">Logout</a></h5>
</body>
</html>