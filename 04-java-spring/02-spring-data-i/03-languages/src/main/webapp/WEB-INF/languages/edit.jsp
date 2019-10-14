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
	<title>Edit <c:out value="${language.name}"/> Language</title>
</head>
<body>
	<p><a href="/languages/{id}">Delete</a>|<a href="/languages">Dashboard</a></p>
	<div class="container">		
		<form:form action='/languages/${language.id}' method= 'post' modelAttribute="language">
			<input type="hidden" name="_method" value="put">		
			<div class="form-group">
		        <form:label path="name">Language Name</form:label>
		        <form:errors path="name"/>
		        <form:input class="form-control" path="name"/>
		   	</div>
		 	<div class="form-group">
		        <form:label path="creator">Creator</form:label>
		        <form:errors path="creator"/>
		        <form:input class="form-control" path="creator"/>
		    </div>
			<div class="form-group">
		        <form:label path="currentVersion">Current Version</form:label>
		        <form:errors path="currentVersion"/>
		        <form:input class="form-control" path="currentVersion"/>
		   	</div>
		   	<input class="btn btn-primary" type="submit" value="Submit"/>
        </form:form>
    </div>    
</body>
</html>