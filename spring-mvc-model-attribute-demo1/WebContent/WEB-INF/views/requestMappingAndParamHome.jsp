<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>RequestMapping and RequestParam test bed</title>
</head>
<body>
	<div align="left">
		<h3>Testing @RequestParam without explicit attributes</h3>
		<form action="test1">
			<input type="text" name="orgName" placeholder="Enter Organization Name">
			<input type="submit" value="Submit"> 
		</form>
	</div>
	<div align="right">
		<h3>Testing @RequestMapping 'method' attribute</h3>
		<form action="test2">
			<input type="text" name="orgName" placeholder="Enter Organization Name">
			<input type="submit" value="Submit"> 
		</form>
	</div>
	<br>
	<div align="right">
		<h3>Testing @RequestMapping 'fallback'</h3>
		<form action="test3">
			<input type="submit" value="Submit"> 
		</form>
	</div>
</body>
</html>