<%@ page import="java.util.List" %>
<%@ page import="com.company.EmployeeRegistrationBean" %>
<!DOCTYPE html>
<% 
List<EmployeeRegistrationBean> al=(List<EmployeeRegistrationBean>)session.getAttribute("list");
for(EmployeeRegistrationBean eb:al)
{%>
<html>
<body bgcolor="wheat" align="center ">
<table border=2 align="center">
<tr>
<th>Fistname</th>
<th>LastName</th>
<th>Mobile</th>
<th>Address</th>
<th>Designation</th>
<th>Age</th>
<th>Mailid</th>
<th>Leaves</th>
<th>Update</th>
</tr>
<tr>
<td><%= eb.getFirstname() %></td>
<td><%= eb.getLastname() %></td>
<td><%= eb.getMobile() %></td>
<td><%= eb.getAddress() %></td>
<td><%= eb.getDesignation() %></td>
<td><%= eb.getAge() %></td>
<td><%= eb.getMailid() %></td>
<td><%= eb.getTotal_days() %></td>
<td><a href="update_employee.html">Update</a>
</tr>
<%} %>
</table>
<h3><a href="employee_home.html">Home</a></h3>
<h3><a href="index.html">Logout</a></h3>
</body>
</html>