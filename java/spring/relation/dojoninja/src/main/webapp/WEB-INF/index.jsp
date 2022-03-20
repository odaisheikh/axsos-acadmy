<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    <%@ page isErrorPage="true" %> 
<h1>New Book</h1>
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
<!-- <table class="table">
  <thead>
	    <tr>
	      <th scope="col">#</th>
	      <th scope="col">expence</th>
	      <th scope="col">vendore</th>
	      <th scope="col">price</th>
	      <th scope="col">edit</th>
	      <th scope="col">delete</th>
	    </tr>
  </thead>
  <tbody>
	  <c:forEach var="onevendor" items="${vendores}">
	    <tr>
	      <th scope="row"><a href = "/books/${onevendor.id }"><c:out value="${onevendor.id }"></c:out></a></th>
	      <td><c:out value="${onevendor.expence}"></c:out></td>
	      <td><c:out value="${onevendor.vendore }"></c:out></td>
	      <td><c:out value="${onevendor.price }"></c:out></td>
	      <td><a href="vendore/${onevendor.id}/edit">edit</a></td>
	      <td><a href="vendore/${onevendor.id}/delete">delete</a></td>
	    </tr>
	    </c:forEach>
	  </tbody>
</table> -->
		<h1>New Book</h1>
<form:form action="/addNinja" method="post" modelAttribute="ninja">
   <p>
       <form:label path="firstName">firstName</form:label>
       <form:errors path="firstName"/>
       <form:input path="firstName"/>
   </p>
   <p>
       <form:label path="lastName">lastName</form:label>
       <form:errors path="lastName"/>
       <form:input path="lastName"/>
   </p>
   <p>
       <form:select path="dojo">
            <c:forEach var="dojo" items="${dojos }">
		       	<form:option value="${dojo}">
		       	<c:out value="${dojo.name }"></c:out>
		    
		       	</form:option>
		       	 </c:forEach>
       </form:select>
   </p>    
   <input type="submit" value="Submit"/>
</form:form> 
</div>
</body>
</html>