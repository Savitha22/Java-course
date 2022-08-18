<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
int number1=Integer.parseInt(request.getParameter("num1"));

int number2=Integer.parseInt(request.getParameter("num2"));
int ans=number1/number2;


out.println("division of number= "+ans);
%>
</body>
</html>