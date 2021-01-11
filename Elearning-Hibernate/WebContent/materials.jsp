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
<a href="index.html"><h2>E-Learning</h2></a>
<table align="center" border=2>
<tr>
<th>Course Name</th>
<th>Subject</th>
</tr>
<%
	List<Course> li=new Course().allCourse();
	Iterator<Course> it=li.iterator();
	while(it.hasNext())
	{
		Course vab=(Course)it.next();
%>
<tr>
<td><%= vab.getName() %></td>
<td><%= vab.getSubject() %></td>
<%} %>
</table>
<br><br>
<a href="adminlogin.html">Tutor</a>||
<a href="userlogin.html">User</a>
</body>
</html>