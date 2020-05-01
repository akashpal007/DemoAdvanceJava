package j2ee_servlet_jsp_jdbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servletCall1")
public class DemoServlet1 extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1758209090061501091L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		PrintWriter out = res.getWriter();

		String name = req.getParameter("name");
		Integer ph = Integer.parseInt(req.getParameter("phNo"));

		out.println("<html><body bgcolor='#afafaf'>");

		out.println("<H3>Name : " + name + "</H3>");
		out.println("<H3>Phone : " + ph + "</H3>");

		out.println("</body></html>");
	}

}
