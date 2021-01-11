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
<h2><a href="student_home.html">E-learning</a></h2>
<table align="center" border=2>
<tr>
<th>Course Name</th>
<th>Subject</th>
<th>Action</th>
<th>View</th>
</tr>
<%
	List<Course> li=new Course().allCourse();
	Iterator<Course> it=li.iterator();
	while(it.hasNext())
	{
		Course vab=(Course)it.next();
			session.setAttribute("path", vab.getPath());
%>
<tr>
<td><%= vab.getName() %></td>
<td><%= vab.getSubject() %></td>
<td><a href="DownloadServlet?filename=<%=vab.getFile()%>">Download</a></td>
<td><a href="ViewTutor?id=<%=vab.getAid()%>">View Tutor Details</a></td>
</tr>
<%} %>
</table>
<br><br>
<a href="student_home.html">Home</a>||
<a href="index.html">Logout</a>
</body>
</html>