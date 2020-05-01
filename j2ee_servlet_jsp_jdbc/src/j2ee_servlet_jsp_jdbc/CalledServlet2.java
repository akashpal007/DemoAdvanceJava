package j2ee_servlet_jsp_jdbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirectServlet")
public class CalledServlet2 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1008758664326137749L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		Integer num1 = Integer.parseInt(req.getParameter("no1"));
		Integer num2 = Integer.parseInt(req.getParameter("no2"));
		
		Integer mul = num1 * num2;

		out.println("<html><body bgcolor='#afafaf'>");

		out.println("<H3>" + num1 + "*" + num2 + "</H3>");
		out.println("<H3>Sum : " + mul + "</H3>");

		out.println("</body></html>");
	}

}
