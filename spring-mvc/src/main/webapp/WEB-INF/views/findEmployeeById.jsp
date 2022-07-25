<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring"
	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>findEmployeeById</title>
</head>
<body>
	<div id="root">

		<div id="form">
			<form:form action="" method="post" modelAttribute="findEmployeeById">

				<div>
					<label for="employee_id">Employee Id</label>
					<div>
						<form:input path="employee_id" />
					</div>
					<div>
						<label for="firstname">First Name</label>
						<div>
							<form:input path="first_name" readonly=true />
						</div>
					</div>
					<div>
						<label for="lastname">lastname</label>
						<div>
							<form:input path="last_name" readonly=true />
						</div>
					</div>
					<div>
						<label for="email">email</label>
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