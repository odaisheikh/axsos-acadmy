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
<link rel="stylesheet" href="/css/show.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<p class="row right" style="text-align:right"><a href="/table">Dashboard</a></p>
<table class="table">
  <thead>
	    <tr>
	      <th scope="col">id</th>
	      <th scope="col">name</th>
	      <th scope="col">rating</th>
	    </tr>
  </thead>
  <tbody>
	  <c:forEach var="onesong" items="${songs}">
	    <tr>
	      <td><c:out value="${onesong.id}"></c:out></td>
	      <td><c:out value="${onesong.name}"></c:out></td>
	      <td><c:out value="${onesong.rating}"></c:out></td>

	    </tr>
	    </c:forEach>
	  </tbody>
</table>
</div>
</body>
</html>