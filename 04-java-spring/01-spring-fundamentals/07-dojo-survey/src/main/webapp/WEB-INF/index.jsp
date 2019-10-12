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
	<title>Dojo Survey</title>
</head>
<body>
	<div class="container">		
		<form action='/result' method= 'post'>
		<div class="form-group row">
        	<label  class="col-sm-2 col-form-label">Your Name:</label>
        	<div class="col-sm-7">
        		<input type='text' class="form-control" name='name'>
        	</div>
        </div>
        <div class="form-group row">
        	<label  class="col-sm-2 col-form-label">Dojo Location:</label>
        	<div class="col-sm-7">
        	 <select name="location">
                <option value="San Jose">San Jose</option>
                <option value="Seattle">Seattle</option>
                <option value="Dallas">Dallas</option>
            </select>
            </div>
	         </div>
         <div class="form-group row">
        	<label  class="col-sm-2 col-form-label">Favorite Language:</label>
        	<div class="col-sm-7">
        	 <select name="language">
                <option value="Python">Python</option>
                <option value="JavaScript">JavaScript</option>
                <option value="HTML">HTML</option>
            </select>
            </div>
	        </div>
        <div class="form-group row">
        	<label class="col-sm-2 col-form-label">Comment(optional):</label>	        
        	<textarea class="form-control" rows="3" name="comment"></textarea>
        </div>
        <input class="btn btn-primary" type='submit' value='Button'>
    	</form>
    </div>	
</body>
</html>