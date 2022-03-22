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
	<h1>New Project hhhhhhhhhhhhhhhhhhhhhhhh</h1>
<form:form action="/addproject" method="post" modelAttribute="Project">
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
       <form:label path="date">date</form:label>
       <form:errors path="date"/>
       <form:input type="date" path="date"/>
   </p>  
   <input type="submit" value="Submit"/>
</form:form>
</body>
</html>