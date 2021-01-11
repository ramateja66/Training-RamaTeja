<%@ page import="com.student.*"%>
<%@ page import="java.util.*"%>
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
<a href="admin_home.html">Home</a>||
<a href="uploadcourse.html">UploadCourse</a>||
<a href="index.html">Logout</a>
<br>
<br>
<br>
<table border=2 align="center">
<tr>
<th>Name</th>
<th>Email</th>
</tr>
<%
List<Student> li=new Student().view();
Iterator<Student> it=li.iterator();
while(it.hasNext())
{
	Student vab=(Student)it.next();
%>
<tr>
<td><%= vab.getName() %></td>
<td><%= vab.getEmail() %></td>
</tr>


<%} %>
</table>

</body>
</html>