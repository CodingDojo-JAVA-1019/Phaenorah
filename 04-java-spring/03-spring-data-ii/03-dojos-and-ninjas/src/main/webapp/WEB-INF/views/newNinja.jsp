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
	<title>Add Ninja</title>
</head>
<body>
	<div class="container" style="text-align:center">
		<h1>New Ninja</h1>
		<form:form modelAttribute="ninja" method="post" action="/ninjas/new">
		    <form:label path="dojo">
		        Dojo:
		        <form:select path="dojo">
		            <c:forEach var="d" items="${dojos}" >
		                <form:option value="${d.id}">${d.name}</form:option>
		            </c:forEach>
		        </form:select>
		    </form:label><br>
		    <form:label path="firstName">
		        First Name:
		        <form:errors path="firstName"/>
		        <form:input path="firstName"/>
		    </form:label><br>
		    <form:label path="lastName">
		        Last Name:
		        <form:errors path="lastName"/>
		        <form:input path="lastName"/>
		    </form:label><br>
		    <form:label path="age">
		        Age:
		        <form:errors path="age"/>
		        <form:input path="age"/>
		    </form:label><br>
		    <button class="btn btn-primary">Create</button>
		
		</form:form>
		
	</div>
</body>
</html>