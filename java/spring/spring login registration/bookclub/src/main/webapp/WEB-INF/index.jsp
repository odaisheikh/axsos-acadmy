<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<h1>home</h1>
	<div class="row">
		<h1 class="col-sm-5"> welcome <c:out value="${user.userName }"></c:out> </h1><p class="col-sm-5"><a href="/logout" >logout</a></p>
	</div>
	<div><p>book from every one</p> <p> <a href="/book">add to my shelf</a> </p></div>
 <table class="table">
  <thead>
	    <tr>
	      <th scope="col">#</th>
	      <th scope="col">title</th>
	      <th scope="col">authore name</th>
	      <th scope="col">posted by</th>
	    </tr>
  </thead>
  <tbody>
	  <c:forEach var="onevendor" items="${allbooks}">
	    <tr>
	      <th scope="row"><a href = "/book/${onevendor.id }"><c:out value="${onevendor.id }"></c:out></a></th>
	      <td><c:out value="${onevendor.title}"></c:out></td>
	      <td><c:out value="${onevendor.aName }"></c:out></td>
	      <td><c:out value="${onevendor.user.userName }"></c:out></td>
	    </tr>
	    </c:forEach>
	  </tbody>
</table> 
</body>
</html>