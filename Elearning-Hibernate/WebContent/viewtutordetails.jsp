<%@ page import="com.admin.*" %>
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
<body bgcolor="lightgray" align="center">
<h2><a href="student_home.html">E-learning</a></h2>
<br>
<form action="./searchCoursesController" method="get">
<input type="text" name="subject" placeholder="Search for your course">
<input type="submit" value="search">
</form>
<br>
<br>
<table align="center" border=2>
<tr>
<th>Name</th>
<th>Experience</th>
<th>Email</th>
</tr>
<%
List<Admin> list=(List<Admin>)session.getAttribute("list");
Iterator<Admin> it=list.iterator();
while(it.hasNext())
{
	Admin admin=it.next();
%>
<tr>
<td><%=admin.getName()%></td>
<td><%=admin.getExperience()%> yrs</td>
<td><%=admin.getMail()%></td>
</tr>
<%} %>
</table>
<br><br>
<a href="courses.jsp">Courses</a>||
<a href="index.html">Logout</a>
</body>
</html>