<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HEader page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	
<img src=<c:url value="resources/pics/hearshoe.jpg"/> width="1500" height="200">
<marquee bgcolor="orange">We value each & every Customer...!!!</marquee>
	</div>
	<div class="collapse navbar-collapse" id="myNavbar">

		<a class="navbar-brand" href="about">FootBazzar</a>
		<ul class="nav navbar-nav">
			<li><a href="#">Products</a></li>
			<li><a href="about">About</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="login"><span class="glyphicon glyphicon-log-in"></span>Sign
					In</a></li>
		</ul>

	</div>
</body>
</html>