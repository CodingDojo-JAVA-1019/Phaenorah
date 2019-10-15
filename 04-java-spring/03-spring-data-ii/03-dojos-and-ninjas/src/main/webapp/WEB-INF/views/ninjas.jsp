<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css"/>
    <script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/webjars/font-awesome/css/font-awesome.min.css"></link>
	<title>Show All Ninjas</title>
</head>
<body>
	<div class="container" style="text-align:center">
		<h1>${dojo.name} Ninjas</h1>
		<table class="table table-striped">
			<thead>
			<tr>
				<th scope="col">First Name</th>
				<th scope="col">Last Name</th>					
				<th scope="col">Age</th>
			</tr>
			</thead>
			<tbody>
				<c:forEach items="${dojo.ninjas}" var="ninja">
			<tr>
				<th scope="row">${ninja.firstName}</th>					
				<th scope="row">${ninja.lastName}</th>
				<th scope="row">${ninja.age}</th>
			</tr>
			</c:forEach>
			</tbody>
		</table>
		<p><a href="/dojos/new">Add a Dojo</a></p>
		<p><a href="/ninjas/new">Add a Ninja</a></p>
	</div>
</body>
</html>