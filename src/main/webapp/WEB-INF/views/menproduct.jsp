<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored = "false" %>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<title>Hello, world!</title>
<style>
.container {
	display: flex;
	margin-top: 40px;
	margin-right: 10px;
	margin-bottom: 80px;
	margin-left: 172px;
}
</style>
</head>
<body>
<%@include file="/WEB-INF/views/header.jsp" %>

	<div class="container">

		<c:forEach items="${GetProduct }" var="product">

			<div class="card" style="width: 18rem;">
				<img src="<c:out value="${product.purl}" /> class="
					card-img-top" alt="..."">
				<div class="card-body">
					<h5 class="card-title">
						<c:out value="${product.pname}" />
					</h5>
					<%-- <p class="card-text">
				<c:out value="${product.Pdetails}" />
					</p> --%>
					<p>
						<c:out value="${product.pprice}" />
					</p>
					<a href="productdetails/${product.id }" class="btn btn-primary">Details</a> 
					<a href="#" class="btn btn-primary">Add Cart</a>
				</div>
			</div>
		</c:forEach>

	</div>









	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>