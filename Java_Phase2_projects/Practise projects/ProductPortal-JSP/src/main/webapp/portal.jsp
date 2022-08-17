<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	Product Id: <%=session.getAttribute("product_id")%><br><br>

   Product Name: <%= session.getAttribute("product_name")%><br><br>

   Price of Product: <%= session.getAttribute("price")%><br><br>

  Quantity: <%= session.getAttribute("quantity")%><br><br>
	

	

</body>
</html>