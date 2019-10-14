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
	<title>Insert title here</title>
</head>
<body>
	<p style="text-align;right"><a href="/languages">Dashboard</a></p>
	<h2><c:out value="${language.name}"/></h2>
	<h2><c:out value="${language.creator}"/></h2>
	<h2><c:out value="${language.currentVersion}"/></h2>
	<form action="/languages/${language.id}" method="post">
	    <input type="hidden" name="_method" value="delete">	    
	</form>	
	<p><a href="/languages/edit/<c:out value="${language.id}"/>">Edit</a></p> 
	<p><a href="/languages/delete/<c:out value="${language.id}"/>" >Delete</a></p>
	
</body>
</html>