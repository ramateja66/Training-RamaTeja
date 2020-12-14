<%@ page import="com.motivity.DoctorAppointmentBean" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<body align="center" bgcolor="grey">
<table border="2" align="center">
<tr>
<th>Name</th>
<th>Gender</th>
<th>Age</th>
<th>Mobile</th>
<th>Status</th>
<th>Action</th>
</tr>
<% String specialist=(String)session.getAttribute("spec");
List<DoctorAppointmentBean> l=new DoctorAppointmentBean().viewAppointments(specialist);
Iterator it=l.iterator();
while(it.hasNext()){
	DoctorAppointmentBean vab=(DoctorAppointmentBean)it.next();
%>
<tr>
<td><%=vab.getName() %></td>
<td><%= vab.getGender() %></td>
<td><%= vab.getAge() %></td>
<td><%= vab.getMobile() %></td>
<td><%= vab.getStatus()%></td> 
<%if(vab.getStatus().equalsIgnoreCase("Accepted")){ %>
<td>Accepted</td>
<%}else{ %>
<td>><a href="./accept_appointment?id=<%=vab.getId() %>">Accept</a></td>
<%} %>

</tr>
<%} %>
</table>
<h2><a href="doctor_home.html">Home</a></h2>
</body>
</html>