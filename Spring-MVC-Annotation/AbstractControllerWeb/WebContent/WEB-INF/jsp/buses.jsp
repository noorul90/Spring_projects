<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Buses!</title>
	</head>
	<body>
	  <table>
	    <tr>
	      <th>Service No</th>
	      <th>Reg No</th>
	      <th>Bus Type</th>
	      <th>Capacity</th>
	    </tr>
	    <c:forEach items="${buses}" var="bus">
	    <tr>
	      <td> ${bus.serviceNo}</td>
	      <td> ${bus.regNo}</td>
	      <td>${bus.busType}</td>
	      <td> ${bus.capacity}</td>
	    </tr>
	    </c:forEach>
	  </table>
	</body>
</html>