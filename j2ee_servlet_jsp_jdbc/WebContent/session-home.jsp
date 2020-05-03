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
		System.out.println("Session # home page called");
		
		if (session.getAttribute("fullName") != null && session.getAttribute("id") != null) {
			System.out.println("Session # home page cookies data printed");
			out.println("<h2>Session Home Page</h2> <br>");
			out.println("<h4>User Full name: </h4>" + session.getAttribute("fullName"));
			out.println("<h4>User Id: </h4>" + session.getAttribute("id"));
		} else {
			response.sendRedirect("session-login.jsp");
		}
	%>
	<form action="sessionLogout" method="post">
		<button type="submit">Logout</button>
	</form>

</body>
</html>