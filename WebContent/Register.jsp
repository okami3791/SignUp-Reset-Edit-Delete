<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register!</title>
</head>
<body bgColor=skyblue >
<center>
<form action="UserServ" method="post">
<table>
<tr>
<td><b>UserName ::</td></b>
<td><input  type="text" name="username" ></td></tr>
<tr>
<td><b>Password ::</td></b>
<td><input type="password" name="pass" ></td></tr>
<tr>
<td><b>Confirm Password ::</td></b>
<td><input type="password" name="cpass" ></td></tr>
<td><b>Email ID :: </td></b>
<td><input type="text" name="email" ></td></tr>
<tr>
<td><b>First Name :: </td></b>
<td><input  type="text" name="first" ></td></tr>
<tr>
<td><b>Last Name ::</td></b>
<td><input type="text" name="last" ></td></tr>
<tr>
<td><b>City ::</td></b>
<td><input type="text" name="city" ></td></tr>
<td><b>Phone Number:: </td></b>
<td><input type="text" name="number" ></td></tr>
<tr><td><input type="submit" value="Save"></td><td><input type="reset" ></td></td></tr>

</table>
</form>
</center>
</body>
</html>