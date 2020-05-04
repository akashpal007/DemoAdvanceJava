package jdbc_crud;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author akash
 *
 */
@WebServlet("/createCustomer")
public class CreateCustomer extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 699977802880647773L;
	/**
	 * 
	 */

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String address = req.getParameter("address");
		int success = -1;
		try {
			CustomerVO customerVO = new CustomerVO();
			customerVO.setName(name);
			customerVO.setAddress(address);

			success = new CustomerHelper().setCustomer(customerVO);
			if (success > 0) {
				System.out.println("Insert successful inserted customer id: " + success + "");
			}
			resp.sendRedirect("readCustomer");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
