<%@page import="com.th.model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% ArrayList<Product> plist = (ArrayList<Product>) request.getAttribute("plist"); %>
	<table width="100" height="50" border="1">
	<% for (Product p:plist)
	{%>
	<tr>
	<td><% out.println(p.getpId()); %></td>
	<td><% out.println(p.getpName()); %></td>
	<td><% out.println(p.getPrice()); %></td>
	</tr>
	<%} %>
	
	</table>

</body>
</html>