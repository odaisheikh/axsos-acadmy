<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<h1><textarea rows="3" cols="3">${counter}</textarea></h1>
<div class="row">
  <div class="col-sm-3">
		<h2>farm</h2>
		<p>earn 10-20 gold</p>
	   <form action="/show/all" method="post" >
	  		<input type="hidden" value="farm" name="gold">
	  		<button type="submit">submit</button>
	  	</form>
  </div>
  <div class="col-sm-3">
  		<h2>cave</h2>
  		<p>earn 10-20 gold</p>
  		<form action='/show/all' method="post">
  		
	  		<input type="hidden" value="farm" name="gold">
	  		<button type="submit">submit</button>
	  	</form></div>
  <div class="col-sm-3">
  	<h2>house</h2>
  	<p>earn 10-20 gold</p>
  	<form action="/show/all" method="post">
	  		<input type="hidden" value="farm" name="gold">
	  		<button type="submit">submit</button>
	  	</form>
  </div>
  <div class="col-sm-3">
  	<h2>guest</h2>
  	<p>earn/takes 0-50 gold</p>
  	<form action="/show/all" method="post">
	  		<input type="hidden" value="guest" name="gold">
	  		<button type="submit">submit</button>
	  	</form>
  </div>
</div>
</div>
</body>
</html>