package j2ee_servlet_jsp_jdbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author A.K.Pal
 */

@WebServlet("/calledServlet5")
public class CalledServlet5 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3910150557744192195L;

	/**
	 * 
	 */

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		Cookie cookies[] = req.getCookies();
		String userName = null;
		Integer userId = null;
		for (int i = 0; i < cookies.length; i++) {
			System.out.println("Cookie Name: " + cookies[i].getName() + "\tCookie value: " + cookies[i].getValue());
			if (cookies[i].getName().equals("userName")) {
				userName = cookies[i].getValue();
			}
			if (cookies[i].getName().equals("userId")) {
				userId = Integer.parseInt(cookies[i].getValue());
			}
		}
		
		if(userName.equals("akash") && userId == 442) {
			out.println("<html><body bgcolor='#afafaf'>");

			out.println("<H3>Matched \n Name : " + userName +"\tuserId : "+userId+"</H3>");

			out.println("</body></html>");
		}else {
			out.println("<html><body bgcolor='#afafaf'>");

			out.println("<H3>Not Matched \n Name : " + userName +"\tuserId : "+userId+"</H3>");

			out.println("</body></html>");
			
		}

	}

}
