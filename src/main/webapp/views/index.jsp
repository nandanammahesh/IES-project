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
	<h2>User Registration Form</h2>
	<font color='green'>${succmsg}</font>
	<font color='red'>${errmsg}</font>
	<form:form action="saveContact" method="POST" modelAttribute="contact">
		<table>
			<tr>
				<td>First Name</td>
				<td><form:input path="firstName" /></td>
				<form:hidden path="contactId"/>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td>contact Email</td>
				<td><form:input path="contactMail" /></td>
			</tr>
			<tr>
				<td>contact Number</td>
				<td><form:input path="contactNum" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:input path="pwd" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><form:radiobutton path="gender" value="M" />Male <form:radiobutton
							path="gender" value="F" />FeMale</td>
			</tr>
			<tr>
				<td>SSN Number</td>
				<td><form:input path="ssnNum" /></td>
			</tr>
			<tr>
				<td>DOB</td>
				<td><form:input path="dob" /></td>
			</tr>
			<tr>
				<td>Role</td>
				<td>
					<form:select path="role">
					<form:option value="-select-"></form:option>
					<form:option value="Admin"></form:option>
					<form:option value="CaseWorker"></form:option>
					</form:select>
					</td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>

		</table>
	</form:form>
	<a href="viewContacts">view All Accounts</a>
	</div>
</body>
</html>