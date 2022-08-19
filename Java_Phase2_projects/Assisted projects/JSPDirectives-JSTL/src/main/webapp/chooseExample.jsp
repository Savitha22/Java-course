<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="marks" scope="session" value="${350}"/>
<c:choose>
<c:when test="${marks>=310}">
	Grade A
</c:when>
<c:when test="${marks>=300}">
	grade="B"
</c:when>
<c:otherwise>
	grade="fail"
</c:otherwise>
</c:choose>

<br>

</body>
</html>