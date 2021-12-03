<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String addmsg = (String)request.getAttribute("msg"); %>
<% if (addmsg!= null){ %>
<h2><%out.println(addmsg); %></h2>
<%} %>

-----------Enter the Product Details ------------ <br><br>

/ProductAccessSpringMVC/index
<form action="/PAOSpringMVC/addproduct"  method="post"> 
  
  Enter  product id:<input type="text" name="pId"><br>
  Enter product name:<input type="text" name="pName"><br>
  Enter product price:<input type="text" name="pPrice"><br>
  <input type="submit"  value="submit">
 </form> 
  
  
  <a href="index.jsp">home page</a>
</body>
</html>