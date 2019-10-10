<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<style>
	.container{
    background-color:plum;
    width: 970px;
    height: 800px;
    margin: 0px auto;
    padding: 20px;
    border: 2px solid black;
    text-align: center
	}
	</style>
	<title>Add Players</title>
</head>
<body>
	
	<div class="container">
		<h2>Add a player to team <c:out value="${team.getTeamName()}"/></h2>
		<form action="ViewTeam.jsp" method= "POST">
			<p> First Name: <input type="text" name="title"></p>
			<p> Last Name: <input type="text" name="title"></p>
			<p> Age: <input type="text" name="title"></p>
			<input class="btn btn-primary" type="submit" value="Create">		
		</form>	
	
	</div>
	
</body>
</html>