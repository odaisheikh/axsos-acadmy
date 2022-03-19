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
<p class="row right" style="text-align:right"><a href="/table">Dashboard</a></p>
<p ><a href="/top/song">top songs></a></p>
<table class="table">
  <thead>
	    <tr>
	      <th scope="col">#</th>
	      <th scope="col">name</th>
	      <th scope="col">rating</th>
	      <th scope="col">edit</th>
	      <th scope="col">delete</th>
	    </tr>
  </thead>
  <tbody>
	  <c:forEach var="onevendor" items="${vendores}">
	    <tr>
	      <th scope="row"><a href = "/books/${onevendor.id }"><c:out value="${onevendor.id }"></c:out></a></th>
	      <td> <a href = "/lookify/find/${onevendor.name }" ><c:out value="${onevendor.name}"></c:out></a> </td>
	      <td><c:out value="${onevendor.rating }"></c:out></td>
	      <td><a href="vendore/${onevendor.id}/edit">edit</a></td>
	      <td><a href="vendore/${onevendor.id}/delete">delete</a></td>
	    </tr>
	    </c:forEach>
	  </tbody>
</table>
		<h1>New song</h1>
<form:form action="/all" method="post" modelAttribute="table">
   <p>
       <form:label path="name">expence</form:label>
       <form:errors path="name"/>
       <form:input path="name"/>
   </p>
   <p>
       <form:label path="rating">price</form:label>
       <form:errors path="rating"/>     
       <form:input type="number" path="rating"/>
   </p>    
   <input type="submit" value="Submit"/>
</form:form> 
</div>
</body>
</html>