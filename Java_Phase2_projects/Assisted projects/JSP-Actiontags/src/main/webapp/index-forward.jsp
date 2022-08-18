<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Front page of Website</h1>
	<jsp:forward page="printHello.jsp">
	<jsp:param name="course" value="Java"/>
	</jsp:forward>
</body>
</html>