<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css"/>
    <script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/webjars/font-awesome/css/font-awesome.min.css"></link>
	<title>Lookify</title>
</head>
<body>
	<div class="container">
		<nav>
			<h3><a href="/songs/new">Add New</a> | <a href="/search/topten">Top Ten</a></h3>
			<form action="/search" class="float-right" method="get">
				<input type="text" name="artist"/>
				<button class="btn btn-primary">Search Artists</button>
			</form>
		</nav>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Name</th>
					<th>Rating</th>					
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${ songs }" var="song">
				<tr>
					<td><a href="/songs/${ song.id }">${ song.songName }</a></td>					
					<td>${ song.rating }</td>
					<td><a href="/delete/${ song.id }">Delete</a></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>