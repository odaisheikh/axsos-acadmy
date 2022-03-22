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
	<div class="row">
  <div class="col-sm-6">
  	<c:forEach var="category" items="${cwithpp }">
  		<p> <c:out value="${category.name}"></c:out> </p>
  	</c:forEach>
  </div>
  <div class="col-sm-6">
  	<form action="/addcp" method="post">
  	<input type="hidden" name="productID" value="${id}" >
		<select name="categoryID">
			<c:forEach var="category" items="${cwithnpp }">
	  			<option value="${category.id}"> <c:out value="${category.name}"></c:out> </option>
	  	    </c:forEach>
		</select>
		<input type="submit" value="Submit"/>
	</form>
  </div>
</div>
</body>
</html>