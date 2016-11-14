<%--@page import="java.util.Date"--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Title from JSP ${name1}!!!</title>
</head>

<%--
<%
System.out.println(request.getParameter("name"));
Date date = new Date();
%>
<div>Current date is <%=date%></div>
--%>

<body>
My first JSP ${name1} second parameter ${pass}
<form action="/login.do" method="post">
<p> <font color="red">${errormes}</font> </p>
Enter your name: <input type="text" name="txtname"/>
Enter your password: <input type="password" name="txtpass"/>
<input type="submit" value="Submit!"/>

 

</form>


</body>
</html>