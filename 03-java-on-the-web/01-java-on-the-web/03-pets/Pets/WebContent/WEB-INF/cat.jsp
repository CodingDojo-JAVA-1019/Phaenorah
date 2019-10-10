<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>New Cats</title>
</head>
<body>

	<p> Your <c:out value="${cat.getBreed()}"/> cat, <c:out value="${cat.getName()}"/>, 
		looked at you with <c:out value="${cat.showAffection()}"/>. You think.      
    </p>
	
</body>
</html>