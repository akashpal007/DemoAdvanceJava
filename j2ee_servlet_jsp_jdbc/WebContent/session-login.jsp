<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	System.out.println("Session #Login page");
%>
	<form action="sessionServlet" method="post">
		<div>
			<input type="text" class="form-control" placeholder="Enter name"
				name="name"><br> <input type="text"
				class="form-control" placeholder="Enter Password." name="pass">
		</div>
		<br> <input type="Submit" class="btn btn-primary" value="Login">
	</form>
	<ul>
		<li>1. if name = "akash" and password = "pass" the login success
			redirected to home page else back to same login page</li>
		<li>2. you can not navigate to cookies-home.jsp if you try to do
			then it redirected you to the login page</li>
	</ul>
	<br>
	<br>
	<br>
	<br>

	<%
	if (session.getAttribute("fullName") != null && session.getAttribute("id") != null) {
		System.out.println("Session # variables");
		out.println("<h4>fullName : </h4>" + session.getAttribute("fullName"));
		out.println("<h4>id : </h4>" + session.getAttribute("id"));
	} 
	%>
</body>
</html>