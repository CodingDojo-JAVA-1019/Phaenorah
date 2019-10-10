<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<style>
	.container{
	background-color: linear-gradient(to top left,#C2D307,#0ED2DC);
    width: 970px;
    height: 800px;
    margin: 0px auto;
    padding: 20px;
    border: 2px solid black;
    text-align: center
	}
	</style>
	<title>Count Sessions</title>
</head>
<body>
	<div class="container">
		<h2>Welcome User!</h2>
		
		<p><a method="GET" href="/counter">Go back to Counter</a></p>
	</div>
</body>
</html>