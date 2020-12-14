<%@ page import="com.company.Showemployees" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<body bgcolor="wheat" align="center">
<table align="center" border="2">
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>Emailid</th>
<th>Gender</th>
<th>Address</th>
<td>Mobile</td>
</tr>
<% 
String designation=(String)session.getAttribute("msd");
List<Showemployees> aa=new Showemployees().view(designation);
Iterator li=aa.iterator();
while(li.hasNext())
{
	Showemployees si=(Showemployees)li.next();
%>
<tr>
<td><%= si.getFirstname() %></td>
<td><%= si.getLastname() %></td>
<td><%= si.getMailid() %></td>
<td><%= si.getGender() %></td>
<td><%= si.getAddress() %></td>
<td><%= si.getNumber() %></td>

<%} %>
</table>
<h3><a href="manager_home.html">Home</a></h3>
</body>
</html>