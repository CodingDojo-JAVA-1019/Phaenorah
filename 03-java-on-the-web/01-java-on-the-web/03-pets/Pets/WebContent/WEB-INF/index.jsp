<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Pets</title>
</head>
<body>
<div class= "container">
	<div class= "dog">
		<h2>Make a Dog!</h2>
		<form action="/Pets/Dogs" method= "GET">
		<p>Name: <input type= "text" name="name"></p>
		<p>Breed: <input type= "text" name="breed"></p>
		<p>Weight (lb): <input type= "text" name="weight"></p>
		<input class="btn btn-success" type="submit" value="Submit">		
		</form>
	</div>
	<div class= "cat">
		<h2>Make a Cat!</h2>
		<form action="/Pets/Cats" method= "GET">
		<p>Name: <input type= "text" name="name"></p>
		<p>Breed: <input type= "text" name="breed"></p>
		<p>Weight (lb): <input type= "text" name="weight"></p>
		<input class="btn btn-success" type="submit" value="Submit">		
		</form>
	</div>
</div>
	
</body>
</html>