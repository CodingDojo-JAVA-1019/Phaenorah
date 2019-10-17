<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
			rel="stylesheet">
		<link rel="stylesheet" href="css/main.css" />
		<meta charset="ISO-8859-1">
	<title>Event Planner</title>
</head>
	<body class="container" style="background-image: linear-gradient(to top left,#C2D307,#0ED2DC)">
		<div>
			<h2>Welcome, ${ user.firstName }</h2><p><a href="/logout">Log Out</a></p>
			<hr />
			<div class="new-event float float-right">
				<p>Plan an Event:</p>
				<form:form action="/events" method="post" modelAttribute="event">
					<form:hidden value="${ user.id }" path="planner"/>
					<div class="form-group">
						<form:label path="name">Name</form:label>
						<form:errors path="name"></form:errors>
						<form:input class="form-control" path="name"></form:input>
					</div>
					<div class="form-group">
						<form:label path="eventDate">Date</form:label>
						<form:errors path="eventDate"></form:errors>
						<form:input class="form-control" type="date" value="${ now }" path="eventDate"></form:input>
					</div>
					 <div class="form-group">
				        <form:label path="city">City</form:label>
				        <form:errors path="city"/>
				        <form:input class="form-control" path="city" />
				    </div>
				    <div class="form-group">
				        <form:label path="state">State</form:label>
				        <form:errors path="state"/>
						<form:select class="form-control" path="state">
						<c:forEach items="${ states }" var="state">
							<option value="${ state }">${ state }</option>
						</c:forEach>
						</form:select>
				    </div>
				    <button class="btn btn-primary">Create Event</button>
			</form:form>
			</div>
			<div class="float float-left">
				<h3>Here are some events in your state:</h3>
				<table class="table table-hover">
					<thead>
						<tr>
							<th>Name</th>
							<th>Date</th>
							<th>City</th>
							<th>Host</th>
							<th>Action/Status</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${ usersStates }" var="event">
						<tr>
							<td><a href="/events/${ event.id }">${ event.name }</a></td>
							<td>${ event.eventDate }</td>
							<td>${ event.city }</td>
							<td>${ event.planner.firstName }</td>
							<td>
							<c:choose>
								<c:when test="${ event.planner.id == user.id }">
									<a href="/events/${ event.id }/edit">Edit</a> |
									<form class="delete-form" action="/events/${ event.id }" method="post">
										<input type="hidden" name="_method" value="delete" />
										<button class="btn btn-danger">Delete</button>
									</form>
								</c:when>
								<c:otherwise>
									<c:choose>
										<c:when test="${ event.attendees.contains(user) }">
											<span>Joining <a href="/events/${ event.id }/a/cancel">Cancel</a></span>
										</c:when>
										<c:otherwise>
											<a href="/events/${ event.id }/a/join">Join</a>								
										</c:otherwise>
									
									</c:choose>
								</c:otherwise>
							</c:choose>
							</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
				<h3>Here are some events in other states:</h3>
				<table class="table table-hover">
					<thead>
						<tr>
							<th>Name</th>
							<th>Date</th>
							<th>City</th>
							<th>State</th>
							<th>Host</th>
							<th>Action/Status</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${ otherStates }" var="event">
						<tr>
							<td><a href="/events/${ event.id }">${ event.name }</a></td>
							<td>${ event.eventDate }</td>
							<td>${ event.city }</td>
							<td>${ event.state }</td>
							<td>${ event.planner.firstName }</td>
							<td>
							<c:choose>
								<c:when test="${ event.planner.id == user.id }">
									<a href="/events/${ event.id }/edit">Edit</a> |
									<form class="delete-form" action="/events/${ event.id }" method="post">
										<input type="hidden" name="_method" value="delete" />
										<button class="btn btn-danger">Delete</button>
									</form>
								</c:when>
								<c:otherwise>
									<c:choose>
										<c:when test="${ event.attendees.contains(user) }">
											<span>Joining <a href="/events/${ event.id }/a/cancel">Cancel</a></span>
										</c:when>
										<c:otherwise>
											<a href="/events/${ event.id }/a/join">Join</a>								
										</c:otherwise>
									
									</c:choose>
								</c:otherwise>
							</c:choose>
							</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</body>
</html>