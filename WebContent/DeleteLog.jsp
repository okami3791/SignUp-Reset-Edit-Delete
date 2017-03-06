<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Login</title>
</head>
<body bgColor=skyblue >
<jsp:include page="Home.jsp"></jsp:include>
<form action="DeleteLogin" method="post">
<table align = "center">
<tr><td>
<h2>To Delete your details enter the registered UserName in the following field:</h2>
</td></tr>
<tr>
<td>Enter UserName:</td><td><input type="text" name = "name" required></td></tr>
<tr>
<td>
<input type="submit" >
</td>
</tr>
</table>
</form>
</body>
</html>