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
String user=request.getParameter("txtName");
pageContext.setAttribute("username",user,PageContext.SESSION_SCOPE);//SESSION_SCOPE, APPLICATION_SCOPE, PAGE_SCOPE,REQUEST_SCOPE
%>
<a href="usePageContext.jsp">Click</a>
</body>
</html>