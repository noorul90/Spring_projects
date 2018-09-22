<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
	  <form action="${pageContext.request.contextPath}/getAvailableJourney.htm" method="post">
	   <table>
	     <tr>
	       <td>source:</td>
	       <td><input type="text" name="src" /></td>
	     </tr>
	     <tr>
	       <td>Destination:</td>
	       <td><input type="text" name="dest" /></td>
	     </tr>
	     <tr>
	       <td>JourneyDate:</td>
	       <td><input type="text" name="jdate" /></td>
	     </tr>
	     <tr>
	       <td colspan="2"><input type="submit" value="search" /></td>
	     </tr>
	   </table>
	  </form>
	</body>
</html>