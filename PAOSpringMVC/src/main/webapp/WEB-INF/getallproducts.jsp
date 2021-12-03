<%@page import="java.util.ArrayList"%>
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
<% ArrayList<Product> plist = (ArrayList<Product>) request.getAttribute("plist");%>
<% for (Product product:plist)
	{%>
<h2>	Product details  <%out.println(product); %></h2>
<%} %>
</body>
</html>