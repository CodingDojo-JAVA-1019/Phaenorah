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
		<h1>New License</h1>
		<form:form action="/licenses" method="post" modelAttribute="license">	    	
	    <form:label path="person">
	        Person:
	        <form:select path="person">
	            <c:forEach items="${persons}" var="person">
	            
	                <form:option value="${person.id}">${person.firstName} ${person.lastName}</form:option>
	
	            </c:forEach>
	        </form:select>
	    </form:label><br>
	    <form:label path="state">State:
	        <form:errors path="state"></form:errors>
	        <form:input path="state"/>
	    </form:label><br>
	    <form:label path="expirationDate">
	        Expiration Date:
	        <form:errors path="expirationDate"></form:errors>
	        <form:input path="expirationDate" type="date"/>
	    </form:label><br>
	    <button class="btn btn-primary">Submit</button>
	    </form:form>
	    </div>
</body>
</html>