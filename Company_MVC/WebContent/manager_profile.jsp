<%@ page import="java.util.List" %>
<%@ page import="com.company.ManagerRegistrationBean" %>
<%
List<ManagerRegistrationBean> al=(List<ManagerRegistrationBean>)session.getAttribute("listmg");
for(ManagerRegistrationBean eb:al)
{
%>
<!DOCTYPE html>
<html>
<body bgcolor="wheat" align="center" align="center">
<table align="center" border=2>
<tr>
<th>Firstname</th>
<th>Lastname</th>
<th>Address</th>
<th>Mailid</th>
<th>Mobile</th>
<th>Action</th>
</tr>
<tr>
<td><%= eb.getFirstname()%></td>
<td><%= eb.getLastname()%></td>
<td><%= eb.getAddress()%></td>
<td><%= eb.getMailid()%></td>
<td><%= eb.getMobile() %></td>
<td><a href="update_manager.html">Update</a></td>
</table>
<% }%>

<h3><a href="manager_home.html">Back</a></h3>
</body>
</html>