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
			<h1>New Book to youre shelf</h1>
<form:form action="/addbook" method="post" modelAttribute="addbook">
   
   <p>
       <form:label path="title">title</form:label>
       <form:errors path="title"/>
       <form:input path="title"/>
   </p>
   <p>
       <form:label path="description">description</form:label>
       <form:errors path="description"/>
       <form:input path="description"/>
   </p>
      <p>
       <form:label path="name">nick name</form:label>
       <form:errors path="name"/>
       <form:input path="name"/>
   </p>
   <p>
       <form:label path="aName">Author name</form:label>
       <form:errors path="aName"/>     
       <form:input  path="aName"/>
   </p>    
   <input type="submit" value="Submit"/>
</form:form> 
</div>
</body>
</html>