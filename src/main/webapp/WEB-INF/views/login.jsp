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
		  <div class="row">
		      	<div class="col-md-10 px-auto">
					<div class="container">
						<div class="blog-posts pt-2 w-100">
							<div class="blog-post bg-dark text-white">
								<c:url value="/login" var="loginUrl"/>
								<div class="container text-center py-5">
									<form action="${loginUrl}" method="post">       
										<c:if test="${param.error != null}">        
											<p>
												Invalid username and password.
											</p>
										</c:if>
										<c:if test="${param.logout != null}">       
											<p>
												You have been logged out.
											</p>
										</c:if>
										<p>
											Username
										</p>
										<p>
											<input type="text" id="username" name="username"/>	
										</p>
										<p>
											Password
										</p>
										<p>
											<input type="password" id="password" name="password"/>	
										</p>
										<input type="hidden"                   
											name="${_csrf.parameterName}"
											value="${_csrf.token}"/>
										<button type="submit" class="btn">Log in</button>
									</form>
								</div>
							</div>
						</div>
					</div>
			 	</div>
  			  	<div class="col-sm-2 text-white sidebar text-center">
  			  		<div class="sidebar-wrapper pt-3">
						<h3><a href="">Latest Posts</a></h3>
						<h3><a href="">Categories</a></h3>						
  			  		</div>
  			  	</div>
		  </div>
		</div>
	</body>
</html>