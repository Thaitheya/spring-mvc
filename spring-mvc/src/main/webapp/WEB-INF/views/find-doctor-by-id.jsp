<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring"
	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Doctor By Id</title>
</head>
<body>
<div id="root">

		<div id="form">
			<form:form action="" method="post" modelAttribute="getDoctor">

				<div>
					<label for="doctor_id">Doctor Id</label>
					<div>
						<form:input path="id" />
					</div>
					<div>
						<label for="doctor_name">Doctor Name</label>
						<div>
							<form:input path="doctor_name" readonly=true />
						</div>
					</div>
					<div>
						<label for="dob">DOB</label>
						<div>
							<form:input path="dob" readonly=true />
						</div>
					</div>
					<div>
						<label for="speciality">Speacilaity</label>
						<div>
							<form:input path="email" readonly=true />
						</div>
					</div>
					<div>
						<label for="hiredate">Hire_date</label>
						<div>
							<form:input path="hire_date" readonly=true />
						</div>
					</div>
					<div>
						<label for="job_id">JobId</label>
						<div>
							<form:input path="job_id" readonly=true />
						</div>
					</div>
					<div>
						<label for="salary">Salary</label>
						<div>
							<form:input path="salary" readonly=true />
						</div>
					</div>
					<div>
						<div>
							<form:button>Add New</form:button>
						</div>
					</div>
			</form:form>


		</div>
	</div>
</body>
</html>