package j2ee_servlet_jsp_jdbc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
@WebServlet("/servletCall6")
public class ServletCall6 extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7148986062930311146L;
	/**
	 * 
	 */

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("/servletCall6");
		//ServletRequest request scope
		req.setAttribute("reqSetAttribute", "This value come using request scope using req.setAttribute()");
		
		//HttpSession session scope
		HttpSession session = req.getSession();
		session.setAttribute("sessionSetAttribute", "This value come using session scope using session.setAttribute()");
		
		//ServletContext application scope
		ServletContext context = getServletContext();
		context.setAttribute("contextSetAttribute", "This value come using application scope using context.setAttribute()");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("callServlet4");
		dispatcher.forward(req, resp);
		
	}

}
