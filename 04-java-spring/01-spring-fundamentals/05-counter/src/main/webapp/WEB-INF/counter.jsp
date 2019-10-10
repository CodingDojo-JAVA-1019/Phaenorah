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
	<title>Counter</title>
</head>
<body>
	<div style= "text-align:center">		
		<h2> You have visited  http://localhost:8080/ <c:out value="${count}"/> times.</h2>
		<h2><a href = "/">Test Another visit</a></h2>
		<h2><a href = "/reset">Reset</a></h2>
	</div>
</body>
</html>