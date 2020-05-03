<!DOCTYPE html>
<html lang="en">
<head>
<title>Servlet Demo</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<style>
body {
	position: relative;
}

form {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
	width: 500px;
	display: inline-block;
}
</style>
</head>
<body data-spy="scroll" data-target=".navbar" data-offset="50">

	<nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="#section1">GenericServlet</a></li>
			<li class="nav-item"><a class="nav-link" href="#section2">HttpServlet</a></li>
			<li class="nav-item"><a class="nav-link" href="#section3">RequestDispatcher</a></li>
			<li class="nav-item"><a class="nav-link" href="#section4">SendRedirect</a></li>

			<li class="nav-item"><a class="nav-link" href="#section5">ServletParameters</a></li>
			<li class="nav-item"><a class="nav-link" href="#section6">Attribute</a></li>
			<li class="nav-item"><a class="nav-link" href="#section7">SessionTracking</a></li>
			<li class="nav-item"><a class="nav-link" href="#section8">Apply</a></li>

			<li class="nav-item"><a class="nav-link" href="#section9">Filter</a></li>
		</ul>
	</nav>

	<div id="section1" class="container-fluid bg-info"
		style="padding-top: 100px; padding-bottom: 70px">

		<jsp:include page="inc/GenericServlet-inc.jsp" />

	</div>
	<div id="section2" class="container-fluid bg-warning"
		style="padding-top: 70px; padding-bottom: 70px">

		<jsp:include page="inc/HttpServlet-inc.jsp" />

	</div>
	<div id="section3" class="container-fluid bg-info"
		style="padding-top: 70px; padding-bottom: 70px">

		<jsp:include page="inc/RequestDispatcher-inc.jsp" />

	</div>
	<div id="section4" class="container-fluid bg-warning"
		style="padding-top: 70px; padding-bottom: 70px">

		<jsp:include page="inc/SendRedirect-inc.jsp" />

	</div>

	<div id="section5" class="container-fluid bg-info"
		style="padding-top: 70px; padding-bottom: 70px">

		<jsp:include page="inc/ServletParameters-inc.jsp" />

	</div>

	<div id="section6" class="container-fluid bg-warning"
		style="padding-top: 70px; padding-bottom: 70px">

		<jsp:include page="inc/Attribute-inc.jsp" />

	</div>

	<div id="section7" class="container-fluid bg-info"
		style="padding-top: 70px; padding-bottom: 70px">

		<jsp:include page="inc/SessionTracking-inc.jsp" />

	</div>

	<div id="section8" class="container-fluid bg-warning"
		style="padding-top: 70px; padding-bottom: 70px">

		<div class="text-center p-3 bg-secondary text-white">
			<h4>8. Login and Logout [Using Cookies & HttpSession]</h4>
		</div>
		<br>
		<div class="btn-group btn-group-justified">
			<a href="cookies-login.jsp" class="btn btn-primary">CookieLogIn</a><a href="session-login.jsp"
				class="btn btn-primary">SessionLogIn</a>
		</div>

	</div>

	<div id="section9" class="container-fluid bg-info"
		style="padding-top: 70px; padding-bottom: 70px">

		<div class="text-center p-3 bg-secondary text-white">
			<h4>9. Servlet Filter</h4>
		</div>
		<br>
		<form action="servletCall3" method="post">
			<br> <input type="Submit" class="btn btn-primary" value="Submit">
		</form>

	</div>

</body>
</html>
