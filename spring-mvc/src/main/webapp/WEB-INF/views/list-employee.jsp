<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div>
		<table id="table root">
			<thead>
				<tr>Employee-Id
				</tr>
				<tr>FirstName
				</tr>
				<tr>LastName
				</tr>
				<tr>Email
				</tr>
				<tr>hire-date
				</tr>
				<tr>Job-Id
				</tr>
				<tr>Salary
				</tr>

			</thead>
			<tbody>
				<c:forEach var="customer" items="${allemployees}">
					<tr>
						<td>${customer.employee_id}</td>
						<td>${cutomer.first_name}</td>
						<td>${customer.last_name}</td>
						<td>${customer.email}</td>
						<td>${customer.hire_date}</td>
						<td>${customer.job_id}</td>
						<td>${customer.salary}</td>

					</tr>

				</c:forEach>


			</tbody>
		</table>

	</div>
</body>
</html>