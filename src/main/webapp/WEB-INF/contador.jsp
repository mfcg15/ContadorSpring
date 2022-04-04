<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri= "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="/css/styles.css">
	<title>Current visit count</title>
</head>
<body>
	 <div class="container">
		 <p>You have visited <span>http://your_server</span> <c:out value="${count}"/> times.</p>
		 <div class="d-flex flex-column justify-content-center enlaces">
		 	<a href="/your_server">Test another visit?</a>
		 	<a href="/new_page">Test visit new page?</a>
		 </div>		
		 <a href="/reset" class="btn btn-primary boton">Reset</a>
	 </div>
</body>
</html>