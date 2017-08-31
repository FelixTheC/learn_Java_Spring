<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listing Organization using JSTL Sql tag</title>
</head>
<body>
	<h1>Listing Organization using JSTL Sql tag</h1>
	<sql:query var="rs" dataSource="jdbc/springdb">
		SELECT * FROM organization
	</sql:query>
	
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Year</th>
				<th>Zip</th>
				<th>Emp Count</th>
				<th>Slogan</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="row" items="${rs.rows}">
				<tr>
					<td>${row.companyName}</td>
					<td>${row.year_of_incorporation}</td>
					<td>${row.postal_code}</td>
					<td>${row.employee_count}</td>
					<td>${row.slogan}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
	<a href="${contextPath}/">Back</a>
</body>
</html>