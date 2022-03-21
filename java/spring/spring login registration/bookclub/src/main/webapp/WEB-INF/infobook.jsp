<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
		<div class="row">
			<div class="col-6"><h1><c:out value="${book.title }"></c:out></h1></div>
			<div class="col-6"><a href="/home">go back to the home</a></div>
		</div>
		<div> <c:out value="${book.user.userName}"></c:out> read <c:out value="${book.title }"> </c:out>  by <c:out  value="${book.aName }"></c:out> </div>
		<div>
			<p><c:out value="${book.description}"></c:out></p>
		</div>
	</div>
</body>
</html>