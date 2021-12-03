<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%String msg = (String)request.getAttribute("msg"); %>

<h2><% if (msg != null){%>
<%out.println(msg);%></h2>
<%} %>

<form action="/ProductAccessSpringMVC/updateproduct" method="post">
	Enter product id 	: <input type="text" name="pId"><br>
	Enter the updated product price : <input type="text" name="price"><br>
	<input type="submit" value="Submit">
</form>
	<a href="index.jsp">Go to Home Page</a>
</body>
</html>