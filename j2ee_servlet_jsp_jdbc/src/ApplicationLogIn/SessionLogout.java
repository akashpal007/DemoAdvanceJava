package ApplicationLogIn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionLogout")
public class SessionLogout extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -370427329270037526L;

	/**
	 * 
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Session #logout process started");

		HttpSession session = req.getSession();
		session.removeAttribute("fullName");
		session.removeAttribute("id");

		resp.sendRedirect("session-login.jsp");
	}
}
