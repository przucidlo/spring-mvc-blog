<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<link rel="stylesheet" href="<c:url value="/css/defaultdark.css"/>" type="text/css"/>
		<title>Abbl.pl</title>
	</head>

	<body>
		<nav class="navbar navbar-dark bg-dark">
		  	<span class="navbar-brand mb-0 h4">Abbl.pl</span>
		</nav>
		<div class="container-fluid">
			<div class="container bg-dark text-white">
				<c:url value="/admin/content/post/add" var="loginUrl"/>
				<form action="${loginUrl}" name="addPost" method="post">       
					<p>
						Post title:
					</p>
					<p>
						<input type="text" id="postTitle" name="postTitle"/>	
					</p>
					<p>
						Post content:
					</p>
					<p>
						<input type="text" id="postContent" name="postContent"/>	
					</p>
					<p>
						Post category:
					</p>
					<p>
						<input type="text" id="postCategory" name="postCategory"/>	
					</p>					
					<input type="hidden"                   
						name="${_csrf.parameterName}"
						value="${_csrf.token}"/>
					<button type="submit" class="btn">Log in</button>
				</form>
			</div>
		</div>
	</body>
</html>