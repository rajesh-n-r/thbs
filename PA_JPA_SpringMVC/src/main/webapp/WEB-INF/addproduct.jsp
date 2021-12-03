<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String msg = (String) request.getAttribute("msg");
 if (msg!=null)
 {%>
 <h3><% out.println(msg);%></h3>
 <%} %>


	<form action="/PA_JPA_SpringMVC/addproduct" method="post">
	Enter product id 	: <input type="text" name="pId"><br>
	Enter product name  : <input type="text" name="pName"><br>
	Enter product price : <input type="text" name="price"><br>
	<input type="submit" value="Submit">
	</form>
	<a href="index.jsp">Go to Home Page</a>
</body>
</html>