package jdbc_crud;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
/**
 * @author akash
 *
 */
@WebServlet("/readCustomer")
public class ReadCustomer extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7361499706094297208L;
	/**
	 * 
	 */

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			ArrayList<CustomerVO> customers = new CustomerHelper().getCustomers();
//			String json = new Gson().toJson(customers);
			HttpSession session = req.getSession();
			session.setAttribute("customers", customers);
			resp.sendRedirect("jdbc.jsp");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
