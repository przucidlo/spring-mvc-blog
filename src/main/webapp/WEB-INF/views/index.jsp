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
						<div class="blog-posts pt-2 w-75">
							<div class="blog-post bg-dark">
								<div class="post-title py-2">
									<div class="cointainer-fluid text-white"> 
										<h2 class="pl-3 mb-0">Example blog post</h2>
									</div>
								</div>
								<div class="post-content text-white pt-2 pb-1">
									<p class="text-justify w-75 mx-auto">
									Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis neque lectus, blandit nec est vitae, iaculis efficitur est. Quisque tincidunt sodales mauris ac iaculis. Interdum et malesuada fames ac ante ipsum primis in faucibus. Proin sed metus urna. Integer vel dapibus quam, eget eleifend neque. Sed sed turpis tellus. Duis tellus turpis, dignissim a diam rhoncus, interdum fermentum mi. Nunc suscipit lectus ligula, eget egestas elit mattis a.
									Proin sed scelerisque nisi. Aliquam a iaculis ligula. Aenean vitae ornare est, ac porta mi. Sed mattis nunc facilisis, condimentum sem vitae, condimentum nisl. Maecenas aliquet, urna eu interdum iaculis, quam diam varius ipsum, ut laoreet nibh eros sit amet massa. Vivamus eleifend malesuada sem. Nullam rutrum augue at elit laoreet, sit amet consequat est placerat. Mauris ac arcu lorem. In ullamcorper nisl sed metus sodales interdum. Phasellus vehicula, nunc eget laoreet ultricies, quam ex luctus sapien, in condimentum tellus nisi ut metus. Sed fermentum sollicitudin risus, vel vulputate tellus facilisis vitae. Vivamus arcu augue, finibus id orci sit amet, pellentesque accumsan ligula. Vivamus eu malesuada enim. Maecenas consectetur bibendum eros in iaculis. Donec imperdiet convallis lorem. Aenean ultricies in velit ac elementum.
									</p>
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