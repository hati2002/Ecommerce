
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
</head>
<body>
	<%
	String name = (String) session.getAttribute("username");
	%>
	<nav class="navbar navbar-expand-lg navbar-light bg-slate-400">
		<a class="navbar-brand" href="home">TREND</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="<c:url value="/home" />">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<%
				if (name != null) {
				%>
				<li class="nav-item active"><a class="nav-link">
						<%
						out.print(name);
						%>
				</a></li>

				<li class="nav-item active"><a class="nav-link" href="<c:url value="/logout" />">Logout
				</a></li>

				<li class="nav-item active"><a class="nav-link" href="<c:url value="/cart" />">AddCart
				</a></li>
				<%
				} else {
				%>
				<li class="nav-item active"><a class="nav-link" href="<c:url value="/signup" />">Sign-up
				</a></li>
				<li class="nav-item active"><a class="nav-link" href="<c:url value="/admin" />">Admin
				</a></li>
				<li class="nav-item active"><a class="nav-link" href="<c:url value="/login" />">Login
				</a></li>
				<%
				}
				%>
			</ul>
					
		</div>
	</nav>





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