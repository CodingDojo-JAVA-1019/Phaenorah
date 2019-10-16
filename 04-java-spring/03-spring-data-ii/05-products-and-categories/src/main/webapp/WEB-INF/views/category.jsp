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
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"></link>
	<title>Category</title>
</head>
<body>
	<div class="container" style="text-align:center">
		<h1>${category.categoryName}</h1>

		<div style="display:inline-block">
    		<h3>Products:</h3>
    		<ul>    
        		<c:forEach var="product" items="${category.products}" >
            	<li><a href="/products/${product.id}">${product.name}</a></li>

        		</c:forEach>
    		</ul>
		</div>
		<div style="display:inline-block">
    		<form method="post" action="/categories/addproduct">
    			<div class="form-group">
    			<h3>Add Products:</h3>
        		<input type="hidden" value="${category.id}" name="categoryId">
        		<select name="productVal" >
            	<c:forEach items="${products}" var="product">
                <option value="${product.id}">${product.name}</option>
            	</c:forEach>
        		</select>
        	<button class="btn btn-primary">Add Category</button>
        	</div>
    		</form>
		</div>
	</div>
</body>
</html>