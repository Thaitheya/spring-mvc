<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get All Doctor</title>
</head>
<body>

	<div>
		<table id="table root">
			<thead>
				<tr>Doctor-Id
				</tr>
				<tr>Doctor_name
				</tr>
				<tr>DOB
				</tr>
				<tr>Speciality
				</tr>
				<tr>City
				</tr>
				<tr>Phone_Number
				</tr>
				<tr>Standard_Fees
				</tr>

			</thead>
			<tbody>
				<c:forEach var="doctors" items="${getalldoctor}">
					<tr>
						<td>${doctors.doctor_id}</td>
						<td>${doctors.doctor_name}</td>
						<td>${doctors.dob}</td>
						<td>${doctors.speciality}</td>
						<td>${doctors.city}</td>
						<td>${doctors.phone_no}</td>
						<td>${doctors.standard_fees}</td>

					</tr>

				</c:forEach>


			</tbody>
		</table>

	</div>

</body>
</html>