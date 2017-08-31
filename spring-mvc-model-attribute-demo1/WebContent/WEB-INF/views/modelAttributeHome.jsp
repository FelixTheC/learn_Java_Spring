<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>@ModelAttribute Test bed</title>
<style type="text/css">
	input[type=text]{
		padding: 10px;
		margin: 10px;
		font-size: 20px
	}
	
	input[type=submit]{
		border: none;
		background-color: #4CAF50;
		color: white;
		padding: 16px;
		margin: 16px;
		cursor: pointer;
		font-size: 20px
	}
	
	h1, h2 {
		text-align: center
	}
</style>
</head>
<body>

	<div align="left">
		<h1>${testdata1A}</h1>
		<hr>
		<h2>${testdata1B}</h2>
	</div>

</body>
</html>