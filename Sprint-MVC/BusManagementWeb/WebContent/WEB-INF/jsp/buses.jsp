<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>buses page</title>
	</head>
	<body>
		<table>
			<tr>
				<th>Service no </th>
				<th>Regd. no.</th>
				<th>Bus Type</th>
			</tr>
			<c:forEach items="${buses}" var="bus">
			<tr>
				<td>
					<a href="${pageContext.request.contextPath}/edit-bus.htm?busId=${bus.busId}">${bus.serviceNo}</a>
				</td>
				<td>${bus.regdNo}</td>
				<td>${bus.busType}</td>
			</tr>
			</c:forEach>
		</table>
	</body>
</html>