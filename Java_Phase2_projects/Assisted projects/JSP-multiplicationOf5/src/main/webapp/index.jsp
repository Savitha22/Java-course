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
Enter the value to get multiplication of 5 : <input type="text" name="number" required>
<input type="submit" value="Submit">
</form>
<%
	String num=request.getParameter("number");
		if(num!=null){
		int snum=Integer.parseInt(num);
		for(int i=1;i<5;i++)
			out.println(snum*i+"<br>");
	}
%>


</body>
</html>