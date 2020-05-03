package ApplicationLogIn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookieLogout")
public class CookieLogout extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1265506015881289216L;

	/**
	 * 
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Cookie #logout process started");
		
		Cookie cookie = new Cookie("fullName", null);
		cookie.setMaxAge(0);
		resp.addCookie(cookie);
		Cookie cookie1 = new Cookie("id", null);
		cookie1.setMaxAge(0);
		resp.addCookie(cookie1);
		

		resp.sendRedirect("cookies-login.jsp");
	}
}
