<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<script>
	function newPostRedirection()
	{
     	location.href = '<c:url value="/admin/content/post/add"/>';
	}
	
	function removePost(postId)
	{
		if(confirm("Please confirm if you really want to remove this post."))
		{
			location.href = '<c:url value="/admin/content/post/remove/' + postId + '"/>';
		}
	}
	</script>

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
		<div class="container-fluid pt-5">
			<div class="container bg-dark text-white py-2">
				<div class="row">
					<div class="col">
						<h4>Content List:</h4>
						<ul class="list-group"> <!-- Blog post management-->
							<c:forEach items="${blogPosts}" var="blogPost">
								<li class="list-group-item list-group-item-dark">
									${blogPost.postTitle} 
									<button type="button" class="btn btn-danger" onclick="removePost(${blogPost.postId})">Remove</button>
								</li>
							</c:forEach>
						</ul>
					</div>
					<div class="col"> <!-- Blog content management-->
						<h4>Content Management</h4>
						<button type="button" class="btn btn-secondary" onclick="newPostRedirection()">Create new post</button>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>