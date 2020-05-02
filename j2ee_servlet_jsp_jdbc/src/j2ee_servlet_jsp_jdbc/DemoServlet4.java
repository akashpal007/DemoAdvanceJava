package j2ee_servlet_jsp_jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author A.K.Pal
 */
@WebServlet("/servletCall4")
public class DemoServlet4 extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1763077737350831160L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer num1 = Integer.parseInt(req.getParameter("num1"));
		Integer num2 = Integer.parseInt(req.getParameter("num2"));
		
		//use of url rewriting
		resp.sendRedirect("redirectServlet?no1="+num1+"&no2="+num2+"");
	}
	

}
