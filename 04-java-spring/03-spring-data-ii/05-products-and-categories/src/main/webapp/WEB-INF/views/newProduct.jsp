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
	<title>New Products</title>
</head>
<body>
	<div class="container" style="text-align:center">
		<h1>New Product</h1>
		<form:form action="/products" method="post" modelAttribute="product" cssClass="test">
    	<form:label path="name">
        	Name:
        	<form:errors path="name"/>
        	<form:input path="name"/>
    	</form:label><br>
    	<form:label path="description">
	        Description:
	        <form:errors path="description"/>
	        <form:textarea path="description" cols="30" rows="4"/>
    	</form:label><br>
    	<form:label path="price">
	        Price:
	        <form:errors path="price"/>
	        <form:input path="price"/>
	    </form:label><br>
    	<button class="btn btn-primary">Create</button>
		</form:form>
	</div>
</body>
</html>