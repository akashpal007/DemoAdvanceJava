package j2ee_servlet_jsp_jdbc;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author A.K.Pal
 */

@WebServlet("/callServlet3")
public class CalledServlet3 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6373618397933202647L;

	/**
	 * 
	 */

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("called \"CalleServlet3\" using getRequestDispatcher().include()");
		// Trying to fetch Driver value which is mapped with ServletCall5
		ServletConfig servletConfig = getServletConfig();
		String driver = servletConfig.getInitParameter("driver");
		//print in consol
		System.out.println("Driver: "+driver);

		//Trying to fetch global Servlet variable or Servlet context parameter
		ServletContext servletContext = getServletContext();
		String global = servletContext.getInitParameter("common");
		//print in consol
		System.out.println("Common variavle: "+global);
	}

}
