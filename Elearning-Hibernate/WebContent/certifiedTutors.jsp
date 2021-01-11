<%@ page import="com.admin.*,java.util.*" %>
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
<body align="Center" >
<h1><a href="verified_home.html">E-Learning</a></h1>
<table align="center" border=2>
<tr>
<th>Name</th>
<th>Mail</th>
<th>Experience</th>
<th>Subject</th>
</tr>
<%
Admin ad=new Admin();
List<Admin> li=ad.viewTutors();
Iterator<Admin> it=li.iterator();
while(it.hasNext())
{
	Admin admin=it.next();

%>
<tr>
<td><%= admin.getName() %></td>
<td><%= admin.getMail() %></td>
<td><%= admin.getExperience() %></td>
<td><%= admin.getSubject() %></td>

</tr>
<%} %>
</table>
</body>
</html>