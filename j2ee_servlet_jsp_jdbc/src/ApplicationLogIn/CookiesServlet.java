package ApplicationLogIn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookiesServlet")
public class CookiesServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2392757758552222974L;
	/**
	 * 
	 */

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		System.out.println(name +"  "+ pass);
		
		if(name.equals("akash") && pass.equals("pass")) {
			System.out.println("match");
			Cookie cookie = new Cookie("fullName", "AkashKrPal");
			resp.addCookie(cookie);
			Cookie cookie1 = new Cookie("id", "41");
			resp.addCookie(cookie1);
			//req.getRequestDispatcher("cookies-home.jsp").forward(req, resp);
			resp.sendRedirect("cookies-home.jsp");
		}else {
			System.out.println("not match");
			resp.sendRedirect("cookies-login.jsp");
		}
	}

}
