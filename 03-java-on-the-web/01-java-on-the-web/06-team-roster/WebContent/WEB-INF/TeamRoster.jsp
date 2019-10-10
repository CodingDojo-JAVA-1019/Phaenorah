<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">	
	<title>Team Roster</title>
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
		<h1>Prototype Roster</h1> <p><a href="/TeamRoster/Teams">New Team</a></p>
		<table action="/TeamRoster/Home" class="table table-bordered">
			<thead>
			<tr>
				<th scope="col-auto">Team</th>
                <th scope="col-auto">Players</th>
                <th scope="col-auto">Action</th>
            </tr>
           	</thead>
           	<tbody>
           	<c:forEach var="team" items="${team }">           	
            <tr>
            <th scope="row"><c:out value="${team.getTeamName()}"/></th>
            <td><c:out value="${team.getNumberOfPlayers()}"/></td>
            <td><a method="GET" href="/TeamRoster/Home">Details</a>|<a href="/TeamRoster/DeleteTeam">Delete</a></td>
            </tr>
            </c:forEach>			
        	</tbody>	
		</table>	
	
	</div>
</body>
</html>