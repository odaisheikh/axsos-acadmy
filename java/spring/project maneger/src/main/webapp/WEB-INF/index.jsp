<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    <%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
		<div class="row">
			<h1> <c:out value="${user.userName }"></c:out> </h1> <p><a href="/">logout</a></p>
		</div>
		<div class="row">
			<h4> all project </h4>                   <p><a href="/project">add project</a></p>
		</div>
		 <table class="table">
  <thead>
	    <tr>
	      <th scope="col">#</th>
	      <th scope="col">project</th>
	      <th scope="col">team lead</th>
	      <th scope="col">due date</th>
	      <th scope="col">action</th>
	    </tr>
  </thead>
  <tbody>
	  <c:forEach var="onevendor" items="${allProjectForNoneUser}">
	        
		     
	    <tr>
	      <th scope="row"><a href = "/book/${onevendor.id }"><c:out value="${onevendor.id }"></c:out></a></th>
	      <td><c:out value="${onevendor.title}"></c:out></td>
		  <td><c:out value="${onevendor.userm.userName }"></c:out></td>
	      <td><c:out value="${onevendor.date }"></c:out></td>
		  <td><a href="join/${onevendor.id}">join team</a></td>
	      
	    </tr>
	    </c:forEach>
	  </tbody>
</table>
		 <table class="table">
  <thead>
	    <tr>
	      <th scope="col">#</th>
	      <th scope="col">project</th>
	      <th scope="col">team lead</th>
	      <th scope="col">due date</th>
	      <th scope="col">action</th>
	    </tr>
  </thead>
  <tbody>
	  <c:forEach var="onevendor" items="${allProjectForUser}">
	        
		     
	    <tr>
	      <th scope="row"><a href = "/book/${onevendor.id }"><c:out value="${onevendor.id }"></c:out></a></th>
	      <td><c:out value="${onevendor.title}"></c:out></td>
	      <td><c:out value="${onevendor.userm.userName }"></c:out></td>
	      <td><c:out value="${onevendor.date }"></c:out></td>
		  <td>	<c:choose>
			    <c:when test="${user.id==onevendor.userm.id}">
			       <a href="project/edit/${onevendor.id }">edit|delete</a>
			    </c:when>    
			    <c:otherwise>
			        <a href="/leavejoin/${onevendor.id }">leave join</a>
			        <br />
			    </c:otherwise>
			</c:choose>

	     </td>
	    </tr>
	    </c:forEach>
	  </tbody>
</table>
	</div>
</body>
</html>