<%@page import="java.sql.*"%>
<%
String id=request.getParameter("id");
String bn=request.getParameter("bn");
String bm=request.getParameter("bm");
String bt=request.getParameter("bt");
String pr=request.getParameter("pr");
String rent=request.getParameter("rent");
String bsemail=(String)session.getAttribute("bsemail");
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/bike";
String name="root";
String pwd="root";
Connection con=DriverManager.getConnection(url,name,pwd);
String sql="update brent set bn=?,bm=?,bt=?,pr=?,rent=? where id=?";
PreparedStatement ps=con.prepareStatement(sql);
ps.setString(1,bn);
ps.setString(2,bm);
ps.setString(3,bt);
ps.setString(4,pr);
ps.setString(5,rent);
ps.setString(6,id);
int x=ps.executeUpdate();
if(x!=0){
	
	response.sendRedirect("bikesrdetails.jsp");
}
	%>