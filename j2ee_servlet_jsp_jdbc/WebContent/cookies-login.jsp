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
	System.out.println("Cookie #Login page");
%>
	<form action="cookiesServlet" method="post">
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
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			out.println("Cookies on session <br>");
			if (cookies.length != 0) {
				for (int i = 0; i < cookies.length; i++) {
					out.println("Name : " + cookies[i].getName()+"  ");
					out.println("Value: " + cookies[i].getValue()+"<br>");
				}
			}
		}
	%>
</body>
</html>