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
}
</style>
</head>
<body data-spy="scroll" data-target=".navbar" data-offset="50">

	<nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="#section1">Demo1</a></li>
			<li class="nav-item"><a class="nav-link" href="#section2">Demo2</a></li>
			<li class="nav-item"><a class="nav-link" href="#section3">Demo3</a></li>
			<li class="nav-item"><a class="nav-link" href="#section4">Demo4</a></li>

			<li class="nav-item"><a class="nav-link" href="#section5">Demo5</a></li>
			<li class="nav-item"><a class="nav-link" href="#section6">Demo6</a></li>
			<li class="nav-item"><a class="nav-link" href="#section7">Demo7</a></li>
			<li class="nav-item"><a class="nav-link" href="#section8">Demo8</a></li>

			<li class="nav-item"><a class="nav-link" href="#section9">Demo9</a></li>
		</ul>
	</nav>

	<div id="section1" class="container-fluid bg-info"
		style="padding-top: 100px; padding-bottom: 70px">

		<div class="text-center p-3 bg-secondary text-white">
			<h4>
				1. Basic Servlet Using Annotation && extends GenericServlet class &&
				Showing data
				<h4>
		</div>
		<br>
		<form action="servletCall1" method="post">
			<div>
				<input type="text" class="form-control" placeholder="Enter name"
					name="name"><br> <input type="number"
					class="form-control" placeholder="Enter Phone no." name="phNo">
			</div>
			<br> <input type="Submit" class="btn btn-primary" value="Submit">
		</form>

	</div>
	<div id="section2" class="container-fluid bg-warning"
		style="padding-top: 70px; padding-bottom: 70px">

		<div class="text-center p-3 bg-secondary text-white">
			<h4>2. Basic Servlet Using extends HttpServlet class and mapping in
				web.xml</h4>
		</div>
		<br>
		<form action="servletCall2" method="post">
			<div>
				<input type="number" class="form-control" placeholder="Enter no."
					name="num1"><br> <input type="number"
					class="form-control" placeholder="Enter no." name="num2">
			</div>
			<br> <input type="Submit" class="btn btn-primary" value="Submit">
		</form>

	</div>
	<div id="section3" class="container-fluid bg-info"
		style="padding-top: 70px; padding-bottom: 70px">

		<div class="text-center p-3 bg-secondary text-white">
			<h4>3. Servlet to servlet calling using
				req.getRequestDispatcher("redirectServlet1").forward(req, res);</h4>
		</div>
		<br>
		<form action="servletCall3" method="post">
			<div>
				<input type="number" class="form-control" placeholder="Enter no."
					name="num1"><br> <input type="number"
					class="form-control" placeholder="Enter no." name="num2">
			</div>
			<br> <input type="Submit" class="btn btn-primary" value="Submit">
		</form>

	</div>
	<div id="section4" class="container-fluid bg-warning"
		style="padding-top: 70px; padding-bottom: 70px">

		<div class="text-center p-3 bg-secondary text-white">
			<h4>4. Servlet to servlet calling using The sendRedirect() method
				of HttpServletResponse interface</h4>
		</div>
		<br>
		<form action="servletCall4" method="post">
			<div>
				<input type="number" class="form-control" placeholder="Enter no."
					name="num1"><br> <input type="number"
					class="form-control" placeholder="Enter no." name="num2">
			</div>
			<br> <input type="Submit" class="btn btn-primary" value="Submit">
		</form>

	</div>



	<div id="section5" class="container-fluid bg-info"
		style="padding-top: 70px; padding-bottom: 70px">

		<div class="text-center p-3 bg-secondary text-white">
			<h4>5. ServletConfig & ServletContext</h4>
		</div>
		<br>
		<form action="servletCall3" method="post">
			<br> <input type="Submit" class="btn btn-primary" value="Submit">
		</form>

	</div>
	<div id="section6" class="container-fluid bg-warning"
		style="padding-top: 70px; padding-bottom: 70px">

		<div class="text-center p-3 bg-secondary text-white">
			<h4>6. Attribute in Servlet[request, session, application scope]</h4>
		</div>
		<br>
		<form action="servletCall4" method="post">
			<br> <input type="Submit" class="btn btn-primary" value="Submit">
		</form>

	</div>
	
		<div id="section7" class="container-fluid bg-info"
		style="padding-top: 70px; padding-bottom: 70px">

		<div class="text-center p-3 bg-secondary text-white">
			<h4>7. Session Tracking techniques [Cookies, Hidden Form Field, URL Rewriting, HttpSession]</h4>
		</div>
		<br>
		<form action="servletCall3" method="post">
			<br> <input type="Submit" class="btn btn-primary" value="Submit">
		</form>

	</div>
	<div id="section8" class="container-fluid bg-warning"
		style="padding-top: 70px; padding-bottom: 70px">

		<div class="text-center p-3 bg-secondary text-white">
			<h4>8. Login and Logout [Using Cookies & HttpSession]</h4>
		</div>
		<br>
		<form action="servletCall4" method="post">
			<br> <input type="Submit" class="btn btn-primary" value="Submit">
		</form>

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
