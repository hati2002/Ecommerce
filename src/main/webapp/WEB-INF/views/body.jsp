<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet" href="<c:url value="/resources/css/body.css"/>">
<style>
.card{
display: inline-block;
}
</style>
</head>
<body>
	<div class="container mt-5 bbb">
	
		<div class="card gap" style="width: 400px">
			<img src="<c:url value="/resources/images/h1.webp"/>">
			<div class="card-body">
				<h4 class="card-title">John Doe</h4>
				<p class="card-text">Some example text some example text. John
					Doe is an architect and engineer</p>
				<a href="menproduct" class="btn btn-primary">Men</a>
			</div>
		</div>
		
		<div class="card gap" style="width: 400px">
			<img src="<c:url value="/resources/images/h2.webp"/>">
			<div class="card-body">
				<h4 class="card-title">John Doe</h4>
				<p class="card-text">Some example text some example text. John
					Doe is an architect and engineer</p>
				<a href="womenproduct" class="btn btn-primary">Women</a>
			</div>
		</div>
		
		<div class="card gap" style="width: 400px">
			<img src="<c:url value="/resources/images/h1.webp"/>">
			<div class="card-body">
				<h4 class="card-title">John Doe</h4>
				<p class="card-text">Some example text some example text. John
					Doe is an architect and engineer</p>
				<a href="#" class="btn btn-primary">Kids</a>
			</div>
		</div>
		
	</div>
</body>

</html>
