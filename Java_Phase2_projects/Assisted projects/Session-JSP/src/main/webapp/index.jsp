<%@ page language="java" contentType="text/html; charset=UTF-8"
   import="java.util.Date" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="index.jsp">
		<input type="text" name="uname"> 
		<input type="submit">

</form>
	<%
	String uname = request.getParameter("uname");
	Date createTime = new Date(session.getCreationTime());
	if (uname != null)
		session.setAttribute("username", uname);
	session.setAttribute("date", createTime);
	%>
<a href="display.jsp">display</a>

</body>
</html>