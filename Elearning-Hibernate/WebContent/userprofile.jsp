<%@ page import="com.student.Student" %>
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
<body>
<%
List<Student> li=(List<Student>)session.getAttribute("list");
Iterator<Student> it=li.iterator();
while(it.hasNext())
{
	Student st=it.next();
%>
<h3><%= st.getName() %></h3>
<%} %>
</body>
</html>