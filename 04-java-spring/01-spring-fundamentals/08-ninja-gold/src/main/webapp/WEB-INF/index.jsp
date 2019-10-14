<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collections"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css"/>
    <script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/webjars/font-awesome/css/font-awesome.min.css"></link>
    <link rel="stylesheet" type="text/css" href="css/gold.css"> 
	<title>Ninja Gold</title>
</head>
<body>
	<div class="container"> 
        <h2>Your Gold:<input class="input is-info" type="text" name="myGold" placeholder="<c:out value="${gold}"/>"></h2>
        <div class="blue">
            <form action="/gold" method= "POST">                
                <h2>Farm</h2>
                <p>(Earns 10-20 golds): <input name="building" type="hidden" value="farm"></p><br>
                <button class="btn btn-success btn-lg" type="submit">Find Gold!</button>
            </form>
        </div>
        <div class="blue">
            <form action="/gold" method= "POST">                
                <h2>Cave</h2>
                <p>(Earns 5-20 golds): <input name="building" type="hidden" value="cave"></p><br>
                <button class="btn btn-danger btn-lg" type="submit">Find Gold!</button>
            </form>
        </div>
        <div class="blue">
            <form action="/gold" method= "POST">                
                <h2>House</h2>
                <p>(Earns 2-5 golds): <input name="building" type="hidden" value="house"></p><br>
                <button class="btn btn-primary btn-lg" type="submit">Find Gold!</button>
            </form>
        </div>
        <div class="blue">
            <form action="/gold" method= "POST">                 
                <h2>Casino</h2>
                <p>(Earns/takes 0-50 golds): <input name="building" type="hidden" value="casino"></p><br>
                <button class="btn btn-warning btn-lg" type="submit">Find Gold!</button>
            </form>
        </div>
        <h2>Activities:</h2>
            <div class="win">
               <% ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");%>
    					<% Collections.reverse(activities); %>    					
    					<c:forEach var="activity" items="${ activities }">
    					<p><c:out value="${activity}"/></p>
    					</c:forEach>
            </div>           
        <button><a method="GET" href="/reset">Go back to Counter</a></button>
        </div>
</body>
</html>