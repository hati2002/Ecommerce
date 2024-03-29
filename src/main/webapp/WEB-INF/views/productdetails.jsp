<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

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

<title>product details</title>
<style>
.container {
	border: 2px solid black;
	width: 260px;
	margin: auto;
	padding: 10px;
	margin-top: 130px;
}
</style>
</head>
<body>
	<%@include file="/WEB-INF/views/header.jsp"%>

	<div class="container" style="max-width: 660px">
		<div class="card mb-3" style="max-width: 540px">
			<div class="row no-gutters">
				<div class="col-md-4">
					<img src="<c:out value="${getProduct.purl}"/> class="
						card-img" alt="..." style="height: 235px;">
				</div>
				<div class="col-md-8">
					<div class="card-body">
						<h5 class="card-title">${getProduct.pname }</h5>
						<p class="card-text">${getProduct.pdetails }</p>
						<p class="card-text">
							<small class="text-muted">${getProduct.pprice }</small>
						</p>
					</div>
				</div>
			</div>
		</div>

		<div>
			<p>Select Size</p>
			<div class="form-check form-check-inline">
				<input class="form-check-input" type="radio"
					name="inlineRadioOptions" id="inlineRadio1" value="option1" /> <label
					class="form-check-label" for="inlineRadio1">M</label>
			</div>
			<div class="form-check form-check-inline">
				<input class="form-check-input" type="radio"
					name="inlineRadioOptions" id="inlineRadio2" value="option2" /> <label
					class="form-check-label" for="inlineRadio2">S</label>
			</div>
			<div class="form-check form-check-inline">
				<input class="form-check-input" type="radio"
					name="inlineRadioOptions" id="inlineRadio2" value="option2" /> <label
					class="form-check-label" for="inlineRadio2">L</label>
			</div>
			<div class="form-check form-check-inline">
				<input class="form-check-input" type="radio"
					name="inlineRadioOptions" id="inlineRadio2" value="option2" /> <label
					class="form-check-label" for="inlineRadio2">XL</label>
			</div>
			<a href="check" class="btn btn-primary">Buy Now</a>
			
			 <a href="<c:url value="/buy/${getProduct.id }"/>"
				 class="btn btn-primary">AddCart</a>


		</div>
	</div>






	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
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