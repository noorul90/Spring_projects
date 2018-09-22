<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>edit bus</title>
	</head>
	<body>
		<form:form commandName="busForm">
			<table>
				<tr>
					<td colspan="2">
						<span style="color: red;">
							<form:errors path="*"/>
						</span>
					</td>
				</tr>
				<tr>
					<td>Service no :</td>
					<td><form:input path="serviceNo"/></td>
				</tr>
				<tr>
					<td>Regd. no</td>
					<td><form:input path="regdNo"/></td>
				</tr>
				<tr>
					<td>Bus type</td>
					<td><form:input path="busType"/></td>
				</tr>
				<tr>
					<td>Seat capacity</td>
					<td><form:input path="seatCapacity"/></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="SAVE">
					</td>
				</tr>
			</table>
		</form:form>
	</body>
</html>