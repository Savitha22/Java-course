<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="com.StudentInfo.Student" scope="session"/>
<table border=2>
<tr>
 <td><jsp:getProperty property="username" name="obj"/></td>
 <td><jsp:getProperty property="address" name="obj"/></tr>
<tr>
</table>
</body>
</html>