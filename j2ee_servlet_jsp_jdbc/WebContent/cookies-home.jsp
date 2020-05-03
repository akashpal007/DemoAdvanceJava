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
		System.out.println("Cookie # home page called");
		Cookie[] cookies = request.getCookies();
		if (cookies.length > 1) {
			out.println("login success....cookies.....<br><br>");
			/* for (int i = 0; i < cookies.length; i++) {
			out.print("Name : " + cookies[i].getName( ) + ",  ");
			out.print("Value: " + cookies[i].getValue( )+" <br/>");
			 } */
			for (int i = 0; i < cookies.length; i++) {
				if (cookies[i].getName().equals("fullName")) {
					out.println("<h4>User Full name: </h4>" + cookies[i].getValue());
				}
				if (cookies[i].getName().equals("id")) {
					out.println("<h4>User id: </h4>" + cookies[i].getValue());
				}
			}
			System.out.println("Cookie # home page cookies data printed");
		} else {
			response.sendRedirect("cookies-login.jsp");
		}
	%>
	<form action="logoutServlet" method="post">
		<button type="submit">Logout</button>
	</form>
</body>
</html>