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
<div class="container">
  <table class="table">
	  <thead>
		    <tr>
		      <th scope="col">#</th>
		      <th scope="col">title</th>
		      <th scope="col">languge</th>
		      <th scope="col">pages</th>
		    </tr>
	  </thead>
	  <tbody>
		  <c:forEach var="book" items="${books}">
		    <tr>
		      <th scope="row"><a href = "/books/${book.id }"><c:out value="${book.id }"></c:out></a></th>
		      <td><c:out value="${book.title}"></c:out></td>
		      <td><c:out value="${book.language }"></c:out></td>
		      <td><c:out value="${book.numberOfPages }"></c:out></td>
		    </tr>
		    </c:forEach>
	  </tbody>
</table>
</div>
</body>
</html>