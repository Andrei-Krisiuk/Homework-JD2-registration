<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Registration form</title>
</head>
<body>
	<form action="toController" method="post">
		<input type="hidden" name="command" value="forward" />
		Enter login:<br />
		<input type="text" name="login" value="login" /><br />
		Enter password:<br />
		<input type="password" name="password" value="password" /><br /> <br />
		Enter name:<br />
		<input type="text" name="name" value="name" /><br />
		Enter surname:<br />
		<input type="text" name="surname" value="surname" /><br />
		Enter year of birth:<br />
		<input type="text" name=yearBirthday value="1900" /><br /> <br />
		<input type="submit" value="Submit" /><br />
	</form>
</body>
</html>