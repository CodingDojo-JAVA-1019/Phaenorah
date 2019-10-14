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
	<title>Languages Dashboard</title>
</head>
<body>
	<h1>All Languages</h1>
	<table class="table table-striped">
  	<thead>
    	<tr>
	      <th scope="col">Name</th>
	      <th scope="col">Creator</th>
	      <th scope="col">Version</th>
	      <th scope="col">Action</th>
	    </tr>
  	</thead>
  	<tbody>
  		<c:forEach items="${languages}" var="language">
      <tr>
      	<th scope="row"><c:out value="${language.name}"/></th>
        <td><c:out value="${language.creator}"/></td>
        <td><c:out value="${language.currentVersion}"/></td>
        <td><a href="/languages/delete/${language.id}">Delete</a>|<a href="/languages/edit/${language.id}">Edit</a>|
        <a href="/languages/${language.id}">Show</a></td>
     </tr>
      </c:forEach>
      </tbody>
    </table>
    <form:form action="/languages" method="post" modelAttribute="language">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="creator">Creator</form:label>
        <form:errors path="creator"/>
        <form:input path="creator"/>
    </p>
    <p>
        <form:label path="currentVersion">Version</form:label>
        <form:errors path="currentVersion"/>
        <form:input path="currentVersion"/>
    </p>    
    <input class="btn btn-primary" type="submit" value="Submit"/>
	</form:form>    
</body>
</html>