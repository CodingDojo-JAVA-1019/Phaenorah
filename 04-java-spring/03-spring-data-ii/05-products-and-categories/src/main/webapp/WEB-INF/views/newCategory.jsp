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
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"></link>
	<title>New Categories</title>
</head>
<body>
	<div class="container" style="text-align:center">
		<h1>New Category</h1>
		<form:form action="/categories/new" method="post" modelAttribute="category">
    	<form:label path="categoryName">
        Name:
        <form:errors path="categoryName"/>
        <form:input path="categoryName"/>
    	</form:label><br>
    	<button class="btn btn-primary">Create</button>

		</form:form>
	</div>
</body>
</html>