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
<input type="password" name="Password">
<input type="submit" value="Save">
<%
String name=request.getParameter("Username");
String password=request.getParameter("Password");
if(name!=null){
	boolean result=validate(name,password);
	if(result==true)
		out.println("Welcome!!! " +name +" your are successfully login");
	else
		out.println("Invalid username and Password");
}


%>
<%!
boolean validate(String username, String password){
	if(username.equalsIgnoreCase("Savitha")&& password.equals("Savitha@123"))
			return true;
	else
		return false;
}


%>
</body>
</html>