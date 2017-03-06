<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgColor=skyblue >
<jsp:include page="Home.jsp"></jsp:include>
<center>
<form action="EditServ" method="post">
<table>
<tr>
<td><b>UserName ::</td></b>
<td> <%out.print(session.getAttribute("name"));  %></td></tr>
<tr>
<td><b>Email ID :: </td></b>
<td><%out.print(session.getAttribute("email"));  %></td></tr>
<tr>
<td><b>First Name :: </td></b>
<td><%out.print(session.getAttribute("first")); %></td></tr>
<tr>
<td><b>Last Name ::</td></b>
<td><%out.print(session.getAttribute("last"));  %></td></tr>
<tr>
<td><b>City ::</td></b>
<td><%out.print(session.getAttribute("city"));  %></td></tr>
<tr>
<td><b>Phone Number:: </td></b>
<td><%out.print(session.getAttribute("number"));  %></td></tr>
<tr><td><input type="submit" value="Confirm"></td></td></tr>

</table>
</form>
</center>
</body>
</html>