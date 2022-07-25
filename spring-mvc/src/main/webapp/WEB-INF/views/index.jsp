<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
<h1>index</h1>
<form action="/print" method="post">
        <div>
            <div>
            <label for="userName">User Name : </label>
            <input type="text" id="userName" name="userName" placeholder="enter User name">
            </div>
            <div>
            <input type="submit" value="Hit me!">
            </div>
        </div>
    </form>
</body>
</html>