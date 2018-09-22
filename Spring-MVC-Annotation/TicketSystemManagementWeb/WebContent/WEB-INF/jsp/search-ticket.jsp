<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ticket Search</title>
</head>
<body>
	<span style="color: red;">
<%-- 	   <form:errors path="*" /> --%>
	   <c:out value="${globalError}" />
	</span>

	<form action="${pageContext.request.contextPath}/search-ticket.htm"
		method="post">
		<table>
			<tr>
				<td>Ticket No:</td>
				<td><input type="text" name="ticketNo" /></td>
			</tr>
			<tr>
				<td>Mobile:</td>
				<td><input type="text" name="mobile" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="center"><input type="submit" value="search" /></td>
			</tr>
		</table>
	</form>

</body>
</html>