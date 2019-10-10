<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Button Clicker</title>
</head>
<body>
	<div style= "text-align:center">
		<form action="/ButtonClicker/Counter" method="POST">	
		<button>Click Me!</button>
		</form>
		<p> You have clicked this button <c:out value="${count}"/> times.</p>
	</div>
</body>
</html>