<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="obj" class="com.StudentInfo.Student" scope="session" />
 <jsp:setProperty property="*" name="obj"/>
 <a href="view.jsp">View Student Details</a>
</body>
</html>