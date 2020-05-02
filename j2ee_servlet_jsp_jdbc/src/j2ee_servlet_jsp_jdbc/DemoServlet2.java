package j2ee_servlet_jsp_jdbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author A.K.Pal
 */
public class DemoServlet2 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2710860965985921008L;

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		Integer num1 = Integer.parseInt(req.getParameter("num1"));
		Integer num2 = Integer.parseInt(req.getParameter("num2"));
		Integer sum = num1 + num2;

		out.println("<html><body bgcolor='#afafaf'>");

		out.println("<H3>" + num1 + "+" + num2 + "</H3>");
		out.println("<H3>Sum : " + sum + "</H3>");

		out.println("</body></html>");
	}

}
