<%@ page import="com.course.*" %>
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
<a href="student_home.html"><h2>E-Learning</h2></a>
<form action="./searchCoursesController" method="get">
<input type="text" name="subject" placeholder="Search for your course">
<input type="submit" value="search">
</form>
<br>
<br>
<table align="center" border=2>
<tr>
<th>Course Name</th>
<th>Subject </th>
<th>Download</th>
<th>View</th>
</tr>
<%
String subject=(String)session.getAttribute("sub");
	List<Course> li=new Course().searchCourses(subject);
	Iterator<Course> it=li.iterator();
	while(it.hasNext())
	{
		Course vab=(Course)it.next();
%>
<tr>

<td><%= vab.getName() %></td>
<td><%= vab.getSubject() %></td>
<td><a href="DownloadServlet?filename=<%=vab.getFile()%>">Download</a></td>
<td><a href="ViewTutor?id=<%=vab.getAid()%>">View Tutor Details</a></td>
</tr>

<%} %>
</table>
<a href="student_home.html">Home</a>||
<a href="index.html">Logout</a>
</body>
</html>