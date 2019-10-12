<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css"/>
    <script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/webjars/font-awesome/css/font-awesome.min.css"></link>
    <link rel="stylesheet" type="text/css" href="css/survey.css"> 
	<title>View Results</title>
</head>
<body>
	<div class="container">
		<h1>Submitted Information</h1>
        <h3>Your Name: <c:out value="${name}"/></h3>
        <h3>Dojo Location: <c:out value="${location}"/></h3>
        <h3>Favorite Language: <c:out value="${language}"/></h3>
        <h3>Comment: <c:out value="${comment}"/></h3>
        <a href="/" class="btn btn-primary" type='submit'>Go Back</a>
     </div>
</body>
</html>