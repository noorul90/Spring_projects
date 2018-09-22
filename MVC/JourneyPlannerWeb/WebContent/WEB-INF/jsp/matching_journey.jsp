<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>journey found for your crieteria</title>
	</head>
	<body>
	 <table>
	  <tr>
	   <th>Source</th>
	   <th>Destination</th>
	   <th>Journey Date</th> 
	  </tr> 
	  <tr>
	   <td><c:out value="${availableJourneys.source}" /></td>
	   <td><c:out value="${availableJourneys.dest}" /></td>
	   <td><fmt:formatDate value="${availableJourneys.journeyDate}" pattern="MM/DD/YYYY" /></td>
	  </tr>
	  
	  <tr>
	   <th>JourneyId</th>
	   <th>Bus Type</th>
	   <th>ticket price</th> 
	  </tr> 
	  <c:forEach items="${availableJourneys.journeys}" var="journey">
	   <tr>
	    <td>${journey.journeyId }</td>
	    <td>${journey.busType }</td>
	    <td>${journey.price }</td>
	   </tr>
	  </c:forEach>
	 	
	 </table>
	 
	</body>
</html>