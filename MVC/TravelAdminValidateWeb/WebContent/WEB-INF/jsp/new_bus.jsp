<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Add Bus</title>
	</head>
<body>

	<form:form>
		<table>
            <tr>
             <td>
              <p style="color:red;">
                <form:errors path="*"/>
              </p>
             </td>
            </tr>
			<tr>
				<td>service no:</td>
				<td><form:input path="srvcno" /></td>
			</tr>
			<tr>
				<td>regist no:</td>
				<td><form:input path="regno" /></td>
			</tr>
			<tr>
				<td>bust type:</td>
				<td><form:input path="bustype" /></td>
			</tr>
			<tr>
				<td>seat capacity:</td>
				<td><form:input path="seatcap" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="save" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
