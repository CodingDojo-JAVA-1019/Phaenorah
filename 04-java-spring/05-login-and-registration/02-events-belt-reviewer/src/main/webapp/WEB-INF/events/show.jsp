<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
			rel="stylesheet">
		<link rel="stylesheet" href="/css/main.css" />
		<meta charset="ISO-8859-1">		
		<title>Event Planner</title>
</head>
	<body class="container" style="background-image: linear-gradient(to top left,#C2D307,#0ED2DC)">
		<div>
			<h2>${ event.name }</h2><p><a href="/logout">Log Out</a></p>
			<div class="event-details-side">
				<h4><strong>Host:</strong> ${ event.planner.firstName }</h4>
				<h4><strong>Date:</strong> ${ event.eventDate }</h4>
				<h4><strong>Location:</strong> ${ event.city }, ${ event.state }</h4>
				<h4><strong>People attending:</strong> ${ event.attendees.size() }</h4>
				<table class="table table-hover">
					<thead>
						<tr>
							<th>Name</th>
							<th>Location</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${ event.attendees }" var="user">
						<tr>
							<td>${ user.firstName } ${ user.lastName }</td>
							<td>${ user.city }, ${ user.state }</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="event-details-side">
				<h3>Message Wall</h3>
				<div class="messages">
				<c:forEach items="${ event.messages }" var="message">
					<p>${ message.author.firstName } says: ${ message.content }</p>
				</c:forEach>
				</div>
				<form action="/events/${ event.id }/comment" method="post">
					<div class="form-group">
						<label for="comment">Add Comment</label>
						<span>${ error }</span>
						<textarea name="comment" id="comment" class="form-control"></textarea>
						<button class="btn btn-primary">Submit</button>
					</div>
					<p><a href="/events">Dashboard</a></p>
				</form>
			</div>
		</div>
	</body>
</html>