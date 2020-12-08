<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="p"%>
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
	<h2>All Plans</h2>
	<p>
		<font color='green'>${delsucc1 }</font>
	</p>
	<a href="loadPlanForm">+Add New Plan</a><br>
	<table border="">
		<tr>
			<th>Plan Name</th>
			<th>Plan Description</th>
			<th>Plan Start Date</th>
			<th>Plan End Date</th>
			<th>Action</th>
		</tr>
		<p:forEach items="${plans}" var="plan">
			<tr>
				<td>${plan.planName }</td>
				<td>${plan.planDesc }</td>
				<td>${plan.startDate }</td>
				<td>${plan.endDate}</td>
				<td><a href="editPlan?pid=${plan.planId}">Edit</a> <a
					href="deletePlan?pid=${plan.planId }"
					onclick="return deleteConfirm()">Delete</a></td>
			</tr>
		</p:forEach>
	</table>
	</div>
</body>
</html>