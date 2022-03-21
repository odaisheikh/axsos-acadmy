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
			<h1>join our growing community</h1>
	<div class="container">
		<div class="row">
			<div class="col-sm-6">
			<h2>register</h2>
				<form:form action="/register" method="post" modelAttribute="newUser">
				   <p>
				       <form:label path="userName">userName</form:label>
				       <form:errors path="userName"/>
				       <form:input path="userName"/>
				   </p>
				      <p>
				       <form:label path="email">email</form:label>
				       <form:errors path="email"/>
				       <form:input path="email"/>
				   </p>
				      <p>
				       <form:label path="password">password</form:label>
				       <form:errors path="password"/>
				       <form:input path="password"/>
				    </p>
				     <p>
				       <form:label path="confirm">confirm</form:label>
				       <form:errors path="confirm"/>
				       <form:input path="confirm"/>
				   </p>
				   <input type="submit" value="Submit"/>
				</form:form>
			</div>
			  <div class="col-sm-6">
			<h2>login</h2>
			<form:form action="/login" method="post" modelAttribute="newLogin">
			       <p>
				       <form:label path="email">email</form:label>
				       <form:errors path="email"/>
				       <form:input path="email"/>
				   </p>
				      <p>
				       <form:label path="password">password</form:label>
				       <form:errors path="password"/>
				       <form:input path="password"/>
				    </p>
				    <input type="submit" value="Submit"/>
			</form:form>
			</div>
		</div>
	</div>
</body>
</html>