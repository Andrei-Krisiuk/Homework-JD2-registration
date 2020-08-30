<%@ page language="java" import="entity.RegistrationInfo" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Info</title>
</head>

<body>
<jsp:useBean id="registrationInfo" class="entity.RegistrationInfo" scope="request" />

<table border="1">
	<caption>Registration Info Table</caption>
	<tr>
	<th>Login</th>
	<th>Password</th>
	<th>Name</th>
	<th>Surname</th>
	<th>Year of birth</th>
	</tr>
	<tr>
	<td> <jsp:getProperty property="login" name="registrationInfo"/> </td>
	<td> <jsp:getProperty property="password" name="registrationInfo"/> </td>
	<td> <jsp:getProperty property="name" name="registrationInfo"/> </td>
	<td> <jsp:getProperty property="surname" name="registrationInfo"/> </td>
	<td> <jsp:getProperty property="yearBirthday" name="registrationInfo"/> </td>
	</tr>
</table>
<br />
<form action="index.jsp" method="post">
	<input type="submit" value="To index.jsp" /><br />
</form>

</body>
</html>