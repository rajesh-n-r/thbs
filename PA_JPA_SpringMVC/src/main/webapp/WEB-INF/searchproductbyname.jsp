<%@page import="com.th.model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Product product = (Product) request.getAttribute("product"); %>
<% if (product != null){ %>
<h2> <%out.println(product); %></h2>
<%} %>

<form action="searchproductbyname" method="post">
	Enter product name to be searched: <input type="text" name="pName"><br>
	<input type="submit" value="submit">
</form>
<a href="index.jsp">go to Home Page</a>
</body>
</html>