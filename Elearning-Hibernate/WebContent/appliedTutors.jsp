<%@ page import="com.tutors.Tutors" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body{
 background-image:url(learning.jpg);
 background-repeat:no-repeat;
 background-size:100%;
}

</style>
</head>
<body align="Center" bgcolor="lightgray">

<hr><h2>E-Learning</h2>
<h3>Applied Tutors</h3>
<table border=2 align="center">
<tr>
<th>Name</th>
<th>Email</th>
<th>Experience </th>
<th>Subject </th>
<th>Resume</th>
<th>Verify</th>
<th>Delete</th>
</tr>
<%
Tutors tutors=new Tutors();
List<Tutors> li=tutors.viewTutors();
Iterator<Tutors> it=li.iterator();
while(it.hasNext())
{
	Tutors ad=it.next();
 
	%>
<tr>
<td><%= ad.getName() %></td>
<td><%= ad.getMail() %></td>
<td><%= ad.getExperience() %> yrs</td>
<td><%= ad.getSubject() %></td>
<td><a href="./downloadResumeController?resume=<%=ad.getResume()%>"><%= ad.getResume() %></a></td>
<% if(ad.getStatus()!=null){ %>
<td>Verified</td>
<%}else{ %>
<td><a href="./verifyTutorController?id=<%=ad.getId()%>">Verify</a>
<td><a href="./deletController?id=<%=ad.getId() %>">Delete</a>
<%} %>

<%}%>
</tr>

<a href="verified_home.html">Home</a>

</body>
</html>