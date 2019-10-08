<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Checkerboard</title>
	<link rel="stylesheet" type="text/css" media="screen" href="CSS/style.css"/>

</head>
<body>	
<%! 

%>
<%
	int height = Integer.parseInt(request.getParameter("height")); 
	int width = Integer.parseInt(request.getParameter("width"));
%>
    <h1>Checkerboard: <%= width %>w X <%= height %>h</h1>	
   
    	<% for(int i = 0; i<height; i++) { %>
    	
    	<div class="container">    		
			<% for (int j = 0; j<width; j++) { %>
				
			<% if( (i+j )%2 ==0 ){%><div class="box blue"></div>
			
			<% }else 
			{ %> <div class="box red"></div><%} %>			
			<%}%>		
		</div>  
		<%}%> 	  
</body>
</html>