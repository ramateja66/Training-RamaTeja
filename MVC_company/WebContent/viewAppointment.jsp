<%@ page import="com.motivity.ViewAppointments" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<body align="center" bgcolor="grey">
<table border=2 align="center">
<tr>
<th>Name</th>
<th>Status</th>
<th>Date</th>
<th>DoctorName</th>
</tr>
<%   
	int id=(Integer)session.getAttribute("p_id");
	List<ViewAppointments> bb=new ViewAppointments().view(id);
	Iterator ll=bb.iterator();
	while(ll.hasNext())
	{
		ViewAppointments vab=(ViewAppointments)ll.next();
%>
<tr>
<td><%= vab.getName() %></td>
<td><%= vab.getStatus() %></td>
<td><%= vab.getDate() %></td>
<td><%= vab.getDoctor() %></td>
</tr>
<%} %>
</table>
<h3><a href="patient_home.html">Back</a></h3>
</body>
</html>