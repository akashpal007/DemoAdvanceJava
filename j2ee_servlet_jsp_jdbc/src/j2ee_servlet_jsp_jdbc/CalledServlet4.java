package j2ee_servlet_jsp_jdbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author A.K.Pal
 */

@WebServlet("/callServlet4")
public class CalledServlet4 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5165583790413806197L;

	/**
	 * 
	 */

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("/callServlet4");
		PrintWriter out = resp.getWriter();

		// get attribute from request scope
		String reqSetAttribute = (String) req.getAttribute("reqSetAttribute");

		// get attribute from session scope
		HttpSession session = req.getSession();
		String sessionSetAttribute = (String) session.getAttribute("sessionSetAttribute");

		// get attribute from application scope
		ServletContext servletContext = getServletContext();
		String contextSetAttribute = (String) servletContext.getAttribute("contextSetAttribute");

		out.println("<html><body bgcolor='#afafaf'>");

		out.println("<H3>req.getAttribute : " + reqSetAttribute + "</H3>");

		out.println("<H3>session.getAttribute : " + sessionSetAttribute + "</H3>");

		out.println("<H3>servletContext.getAttribute : " + contextSetAttribute + "</H3>");

		out.println("</body></html>");
	}

}
