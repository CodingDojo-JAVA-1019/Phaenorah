<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Team Information</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">	
	<style>
	.container{
    background-color:plum;
    width: 970px;
    height: 800px;
    margin: 0px auto;
    padding: 20px;
    border: 2px solid black;    
	}
	p{
	text-align: right;	
	}
	</style>
</head>
<body>
	<div class="container">
		<h1><c:out value="${team.getTeamName()}"/></h1> <p><a href="/TeamRoster/Teams">New <c:out value="${team.getTeamName()}"/></a></p>
		<table action="/TeamRoster/Home" class="table table-bordered">
			<thead>
			<tr>
				<th scope="col-auto">First Name</th>
                <th scope="col-auto">Last Name</th>
                <th scope="col-auto">Age</th>
                <th scope="col-auto">Action</th>
            </tr>
           	</thead>
           	<tbody>
           	<c:forEach var="player" items="${player}">           		
            <tr>
            <th scope="row"><c:out value="${player.getFirstName()}"/></th>
            <td><c:out value="${player.getLastName()}"/></td>
            <td><c:out value="${player.getAge()}"/></td>
            <td><a method="GET" href="/TeamRoster/Home">Details</a>|<a href="/TeamRoster/DeleteTeam">Delete</a></td>
			</tr>
			</c:forEach>
        	</tbody>	
		</table>	
	</div>
</body>
</html>