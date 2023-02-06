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
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

form {
	border: 3px solid #f1f1f1;
}

input[type=text], input[type=password] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

button {
	background-color: #04AA6D;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
}

button:hover {
	opacity: 0.8;
}

.cancelbtn {
	width: auto;
	padding: 10px 18px;
	background-color: #f44336;
}

.imgcontainer {
	text-align: center;
	margin: 24px 0 12px 0;
}

.container {
	padding: 16px;
}

span.psw {
	float: right;
	padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
	span.psw {
		display: block;
		float: none;
	}
	.cancelbtn {
		width: 100%;
	}
}

h2 {
	text-align: center;
	color: #04AA6D;
	margin-top: 3rem;
}

form {
	border: 2px solid black;
	width: 500px;
	margin-left: 550px;
}
</style>
</head>
<body>
	<%@include file="header.jsp"%>

	<h2>Admin Login Form</h2>

	<form action="adminform" method="post">

		<div class="container">
			
				<label for="amail"><b>Adminmail</b></label> 
				<input type="text"
				placeholder="Enter mail" name="amail" required> <label
				for="psw"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="psw" required>


		<button type="submit">Login</button>
			<label> <input type="checkbox" checked="checked"
				name="remember"> Remember me
			</label>
		</div>
		<div class="container" style="background-color: #f1f1f1">
			<button type="button" class="cancelbtn">Cancel</button>
		</div>
	</form>
</body>

<%@include file="footer.jsp"%>

</html>