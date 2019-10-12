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
	<title>Code</title>
</head>
<body class="p-3 mb-2 bg-info text-white">
	<div style= "text-align:center">	
		<h2>What is the Code?</h2>
		<form action="/code" method="POST">
			<div>
				<p class="text-danger"><c:out value="${error}"/></p>				
				<input type="text" name="code" />
			</div><br>				
			<p>
			<button type="submit" class="btn btn-primary">Try Code</button>
			</p>
		</form>	
	</div>
</body>
</html>