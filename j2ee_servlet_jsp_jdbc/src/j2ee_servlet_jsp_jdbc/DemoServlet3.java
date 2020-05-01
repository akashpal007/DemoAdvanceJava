package j2ee_servlet_jsp_jdbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servletCall3")
public class DemoServlet3 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2219287066357357539L;

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		Integer num1 = Integer.parseInt(req.getParameter("num1"));
		Integer num2 = Integer.parseInt(req.getParameter("num2"));
		String msg = "";
		
		if(num1 < 0 || num2 < 0) {
			msg = "Numbers must be positive";
			
			out.println("<html><body bgcolor='#afafaf'>");
			out.println("Servlet call successful but " + msg);
			//console print
			System.out.println("Servlet call success full "+ msg);
			out.println("</body></html>");
		}else {
			System.out.println("Redirect Section called");
			RequestDispatcher dispatcher = req.getRequestDispatcher("redirectServlet1");
			dispatcher.forward(req, res);
		}
		
	}

}
