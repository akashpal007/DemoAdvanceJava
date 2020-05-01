package j2ee_servlet_jsp_jdbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/redirectServlet1")
public class CalledServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3037074258789554762L;

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Redirect working");
		PrintWriter out = res.getWriter();
		Integer num1 = Integer.parseInt(req.getParameter("num1"));
		Integer num2 = Integer.parseInt(req.getParameter("num2"));
		
		Integer result = (int) Math.pow(num1, num2);
		
		out.println("<html><body bgcolor='#afafaf'>");

		out.println("<H3>" + num1 + "<sup>" + num2 + "</sup>" + "</H3>");
		out.println("<H3>Result : " + result + "</H3>");

		out.println("</body></html>");
		

	}

}
