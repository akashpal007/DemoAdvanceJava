package ApplicationLogIn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionServlet")
public class SessionServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -185691291433270484L;

	/**
	 * 
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		System.out.println("Session #    " + name + "  " + pass);

		if (name.equals("akash") && pass.equals("pass")) {
			HttpSession session = req.getSession();
			session.setAttribute("fullName", "Akash Kumar Pal");
			session.setAttribute("id", "44");

			resp.sendRedirect("session-home.jsp");
		} else {
			System.out.println("not match");
			resp.sendRedirect("session-login.jsp");
		}
	}

}
