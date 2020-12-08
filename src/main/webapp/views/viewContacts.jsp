<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IES_Application</title>
<script>
	function deleteConfirm() {
		return confirm("Are you sure,You want to delete?");
	}
</script>
</head>
<body>
<div align="center">
	<h2>All Accounts</h2>
	<p>
		<font color='green'>${delsucc }</font>
	</p>
	<a href="/">+Add New Account</a><br>
	<table border="">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Phone Number</th>
			<th>SSN</th>
			<th>PWD</th>
			<th>DOB</th>
			<th>Role</th>
			<th>Gender</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${contacts}" var="contact">
			<tr>
				<td>${contact.firstName }</td>
				<td>${contact.lastName }</td>
				<td>${contact.contactMail }</td>
				<td>${contact.contactNum }</td>
				<td>${contact.ssnNum }</td>
				<td>${contact.pwd }</td>
				<td>${contact.dob}</td>
				<td>${contact.role }</td>
				<td>${contact.gender }</td>
				<td><a href="editContact?cid=${contact.contactId}">Edit</a> <a
					href="deleteContact?cid=${contact.contactId }"
					onclick="return deleteConfirm()">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>