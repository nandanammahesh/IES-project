<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IES_Application</title>
</head>
<body>
<div align="center">
	<h2>Plan Registration Form</h2>
	<font color='green'>${succmsg1}</font>
	<font color='red'>${errmsg1}</font>
	<form:form action="savePlan" method="POST" modelAttribute="plan">
		<table>
			<tr>
				<td>Plan Name</td>
				<td><form:input path="planName" /></td>
				<form:hidden path="planId"/>
			</tr>
			<tr>
				<td>Plan Description</td>
				<td><form:input path="planDesc" /></td>
			</tr>
			<tr>
				<td>Plan Start Date</td>
				<td><form:input path="startDate" /></td>
			</tr>
			<tr>
				<td>Plan End Date</td>
				<td><form:input path="endDate" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register" /></td>
			</tr>

		</table>
	</form:form>
	<a href="viewPlans">view All Plans</a>
	</div>
</body>
</html>