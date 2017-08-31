<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello with Spring</title>
</head>
<body>

	<%
		String messages[] = (String[]) request.getAttribute("myWelcomeMessage");
		String welcomeMessage = "";
		for(String msg: messages) {
			welcomeMessage += msg + " ";
		}
		//out.print("<h1>"+messages[0]+"</h1><h2>"+messages[1]+"</h2>");
		out.print("<h1>"+welcomeMessage+"</h1>");
	%>

</body>
</html>