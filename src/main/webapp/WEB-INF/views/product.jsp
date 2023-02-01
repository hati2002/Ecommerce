<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Hello, world!</title>
<style type="text/css">
h1 {
	font-style: oblique;
	margin-top: 80px
}

form {
	box-sizing: border-box;
	width: 600px;
	margin-left: 450px;
	margin-top: 70px
}
</style>
</head>
<body>
	<%@include file="/WEB-INF/views/header.jsp"%>

	<h1 style="text-align: center; color: green;">Product Details</h1>

	<form action="productform" method="post">
		<div class="form-group">
			<label for="pname">Product Name</label> <input type="text"
				class="form-control" id="pname" aria-describedby="emailHelp"
				placeholder="Enter Product name" name="pname">
		</div>
		<div class="form-group">
			<label for="Pdetails">Product Details</label>
			<textarea class="form-control" id="exampleFormControlTextarea1"
				rows="3" id="Pdetails" name="Pdetails"></textarea>
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Price</label> <input type="number"
				class="form-control" id="exampleInputPassword1"
				placeholder="Password" name="pprice">
		</div>

		<div class="form-group">
			<label for="pname">Product Url</label> <input type="text"
				class="form-control" id="purl" aria-describedby="emailHelp"
				placeholder="" name="purl">
		</div>

		<div class="form-check">
			<input class="form-check-input" type="checkbox" value=""
				id="flexCheckDefault" name="men"> <label
				class="form-check-label" for="flexCheckDefault"> Men </label>
		</div>

		<div class="form-check">
			<input class="form-check-input" type="checkbox" value=""
				id="flexCheckChecked" name="women"> <label
				class="form-check-label" for="flexCheckChecked"> Women </label>
		</div>

		<div class="form-check">
			<input class="form-check-input" type="checkbox" value=""
				id="flexCheckChecked" name="kids"> <label
				class="form-check-label" for="flexCheckChecked"> Kids </label>
		</div>
		<button type="submit" class="btn btn-primary" style="margin-left: 260px;"">Click Here</button>
	</form>














	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>