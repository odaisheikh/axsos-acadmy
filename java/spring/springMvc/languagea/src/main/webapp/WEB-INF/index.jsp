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
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	<table class="table">
	  <thead>
		    <tr>
		      <th scope="col">name</th>
		      <th scope="col">creator</th>
		      <th scope="col">language</th>
		      <th scope="col">Action</th>
		    </tr>
	  </thead>
	  <tbody>
	  		  <c:forEach var="oneBook" items="${books}">
			   <tr>
			      <td> <c:out value="${oneBook.creater}"></c:out> </td>
				  <td> <a href="findBy/${oneBook.id }"><c:out value="${oneBook.name }"></c:out></a> </td>
			      <td> <c:out value="${oneBook.version }"></c:out> </td>
		          <td><a href="vendore/${oneBook.id}/edit">edit</a><span> | </span><a href="vendore/${oneBook.id}/delete">delete</a></td>
		    </tr>
		    </c:forEach>
	  </tbody>
</table>
		<h1>New Book</h1>
<form:form action="/all/books" method="post" modelAttribute="languge">
    <p>
        <form:label path="creater">creator</form:label>
        <form:errors path="creater"/>
        <form:input path="creater"/>
    </p>
    <p>
        <form:label path="name">name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="version">version</form:label>
        <form:errors path="version"/>     
        <form:input type="versionr" path="version"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form> 
	</div>
</body>
</html>