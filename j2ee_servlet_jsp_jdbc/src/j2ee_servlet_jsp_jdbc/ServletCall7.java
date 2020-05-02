package j2ee_servlet_jsp_jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author A.K.Pal
 */
@WebServlet("/servletCall7")
public class ServletCall7 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6191753450822425442L;
	/**
	 * 
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("userName");
		String userId = req.getParameter("userId");
		System.out.println("User Input\n"+"userName: "+userName+"\nuserId(Send as a Hidden field): "+userId+"");
		
		Cookie cookie = new Cookie("userName", userName);
		resp.addCookie(cookie);
		cookie = new Cookie("userId", userId);
		resp.addCookie(cookie);
		
		req.getRequestDispatcher("calledServlet5").forward(req, resp);
	}
}
