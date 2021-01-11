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
<body align="center" bgcolor="lightgray">
<h2><a href="admin_home.html">E-Learning</a></h2>
<table align="center" border=2>
<tr>
<th>Course Name</th>
<th>Subject </th>
</tr>
<%
	int aid=(int)session.getAttribute("aid");
	List<Course> list=new Course().mycourses(aid);
	Iterator<Course> it=list.iterator();
	while(it.hasNext())
	{
		Course course=it.next();
%>
<tr>
<td><%= course.getName() %></td>
<td><%= course.getSubject() %></td>
</tr>
<%} %>
</table>
<a href="admin_home.html">Home</a>||
<a href="uploadcourse.html">Upload Course</a>||
<a href="index.html">Logout</a>
</body>
</html>