<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    <%@ page isErrorPage="true" %> 
 
 
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
			<h1>dojo</h1>
			<div class="container">
 <table class="table">
  <thead>
	    <tr>
	      <th scope="col">#</th>
	      <th scope="col">first name</th>
	      <th scope="col">last name</th>
	    </tr>
  </thead>
  <tbody>
	   <c:forEach var="dojos" items="${dojo.ninjas }">
	    <tr>
	      <td><c:out value="${dojos.id }"></c:out></td>
	      <td><c:out value="${dojos.firstName}"></c:out></td>
	      <td><c:out value="${dojos.lastName }"></c:out></td>
	     
	    </tr>
	    </c:forEach>
	  </tbody>
</table> 

</div>
</div>
</body>
</html>