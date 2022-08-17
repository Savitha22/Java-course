<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="index.jsp">
	<input type="text" name="Username">
	<input type="submit" value="Save">
<%
String name=request.getParameter("Username");
if(name!=null)
	out.println("Welcome "+name);


%>
</body>
</html>