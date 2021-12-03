<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<% String msg = (String) request.getAttribute("babyremark");
   if (msg!=null)
   {
%><h1><% out.println(msg); %></h1>	    
   <%} %>

<body>
<form action="babyservlet"  method="post">

Enter the id: <input type="text" name="id"><br>
Enter the weight: <input type="text" name="wt"><br>
<input type="submit" value ="click here"> 


</form>



</body>
<script type="text/javascript">



</script>
</html>