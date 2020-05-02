package j2ee_servlet_jsp_jdbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author A.K.Pal
 */

//@WebServlet("/servletCall5")  <If we use annotation then we can not get ServletConfig param values>
public class ServletCall5 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4908873464525826271L;

	/**
	 * 
	 */

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		String name = req.getParameter("name");
		
		//Servlet specific parameters
		ServletConfig servletConfig = getServletConfig();
		String driver = servletConfig.getInitParameter("driver");
		
		//globally available Servlet variables
		//ServletContext Parameters are available in all the Servlet in the project
		ServletContext servletContext = getServletContext();
		String global  = servletContext.getInitParameter("common");

		out.println("<html><body bgcolor='#afafaf'>");

		out.println("<H3>This data coming in request object \n Name : " + name + "</H3>");

		out.println("<H3><i>ServletConfig </i>This data declared in web.xml file \n Driver : " + driver + "</H3>");
		
		out.println("<H3><i>ServletContext </i>This data declared in web.xml file \n Common Data : " + global + "</H3>");
		
		out.println("<br><br><H2>check consol"+"</H2>");

		out.println("</body></html>");
		
		
		System.out.println("ServletCall5 values \n"+"name: "+ name +"\nDriver : " + driver+"\nCommon Data : " + global );
		
		
		//Use of include
		req.getRequestDispatcher("callServlet3").include(req, resp);
		
		
	}

}
