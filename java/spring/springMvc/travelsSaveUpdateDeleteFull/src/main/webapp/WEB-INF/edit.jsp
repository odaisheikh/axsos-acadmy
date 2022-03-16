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
			<h1>New Book</h1>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<form:form action="/vendore/${table.id}" method="post" modelAttribute="table">
    <input type="hidden" name="_method" value="put">
    <p>
        <form:label path="expence">expence</form:label>
        <form:errors path="expence"/>
        <form:input path="expence"/>
    </p>
    <p>
        <form:label path="vendore">vendore</form:label>
        <form:errors path="vendore"/>
        <form:input path="vendore"/>
    </p>
    <p>
        <form:label path="price">price</form:label>
        <form:errors path="price"/>     
        <form:input type="number" path="price"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form> 
</div>
</body>
</html>