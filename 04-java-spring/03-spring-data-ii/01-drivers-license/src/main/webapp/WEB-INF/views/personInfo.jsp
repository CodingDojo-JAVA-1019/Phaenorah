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
	<title>Relationships</title>
</head>
<body>
	<div class="container">
	<nav>
			<h2><a href="/persons/new">Add Person</a> | <a href="/licenses/new">Add License</a></h2>
		</nav>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Name</th>
					<th>License #</th>	
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${ persons }" var="person">
				<tr>
					<td>${ person.firstName } ${ person.lastName }</td>
					<td>${ person.license.getNumberAsString() }</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	
	</div>
</body>
</html>