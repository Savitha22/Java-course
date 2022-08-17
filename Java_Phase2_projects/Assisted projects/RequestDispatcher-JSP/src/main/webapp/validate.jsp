<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String uname=request.getParameter("txtName");
String pword=request.getParameter("txtPword");
if(uname.equalsIgnoreCase("Java") && pword.equals("Java123")){
	getServletContext().getRequestDispatcher("/validate2.jsp").forward(request,response);
}		
else{
		out.println("Wrong user name and password");
		
	getServletContext().getRequestDispatcher("/Login.jsp").include(request,response);
}
out.println("<a href='validate2.jsp?txtName="+uname+"'>validate2</a>");
%>

</body>
</html>