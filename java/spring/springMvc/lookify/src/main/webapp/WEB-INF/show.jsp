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
<link rel="stylesheet" href="/css/show.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<p class="row right" style="text-align:right"><a href="/table">Dashboard</a></p>
<c:forEach var="oneSong" items="${song}">
<div class="row"><h3 class="col-3">id </h3 > <h3 class="col-3"><c:out value="${oneSong.id}"></c:out> </h3> </div>
<div class="row"><h3 class="col-3">name </h3 > <h3 class="col-3"><c:out value="${oneSong.name}"></c:out> </h3> </div>
<div class="row"><h3 class="col-3">rating </h3 > <h3 class="col-3"><c:out value="${oneSong.rating}"></c:out> </h3> </div>
</c:forEach>
</div>
</body>
</html>