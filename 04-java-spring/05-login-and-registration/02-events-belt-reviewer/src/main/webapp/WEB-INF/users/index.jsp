<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
		<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
			rel="stylesheet">
		<link rel="stylesheet" href="/css/main.css" />
		<meta charset="ISO-8859-1">		
		<title>Event Planner</title>
</head>
	<body class="container" style="background-image: linear-gradient(to top left,#C2D307,#0ED2DC)">
		<div>
			<form:form class="user-form" action="/" method="post" modelAttribute="registration">
				<h2>Register</h2>
			 	<div class="form-group">
			        <form:label path="firstName">First Name</form:label>
			        <form:errors path="firstName"/>
			        <form:input class="form-control" path="firstName" />
			    </div>
			    <div class="form-group">
			        <form:label path="lastName">Last Name</form:label>
			        <form:errors path="lastName"/>
			        <form:input class="form-control" path="lastName" />
			    </div>
			    <div class="form-group">
			        <form:label path="email">Email</form:label>
			        <form:errors path="email"/>
			        <form:input type="email" class="form-control" path="email" />
			    </div>
			    <div class="form-group">
			        <form:label path="city">City</form:label>
			        <form:errors path="city"/>
			        <form:input class="form-control" path="city" />
			    </div>
			    <div class="form-group">
			        <form:label path="state">State</form:label>
			        <form:errors path="state"/>
					<form:select path="state">
					<c:forEach items="${ states }" var="state">
						<option value="${ state }">${ state }</option>
					</c:forEach>
					</form:select>
			    </div>
			     <div class="form-group">
			        <form:label path="password">Password</form:label>
			        <form:errors path="password"/>
			        <form:password class="form-control" path="password" />
			    </div>
			    <div class="form-group">
			        <form:label path="passwordConfirmation">Confirm Password</form:label>
			        <form:errors path="passwordConfirmation"/>
			        <form:password class="form-control" path="passwordConfirmation" />
			    </div>
			    <button>Register</button>
			</form:form>
			<form action="/login" class="user-form" method="post">
				<h2>Login</h2>
				<span>${ error }</span>
				<div class="form-group">
					<label for="email">Email</label>
					<input type="email" name="email" id="email" class="form-control" />
				</div>
				<div class="form-group">
			        <label for="password">Password</label>
			        <input type="password" name="password" id="password" class="form-control" />		        
			    </div>
			    <button>Login</button>
			</form>
		</div>
	</body>
</html>