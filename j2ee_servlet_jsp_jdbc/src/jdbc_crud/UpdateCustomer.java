/**
 * 
 */
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
@WebServlet("/updateCustomer")
public class UpdateCustomer extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6398365688485991808L;

	/**
	 * 
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String address = req.getParameter("address");
		int success = -1;
		try {
			CustomerVO customerVO = new CustomerVO();
			customerVO.setId(id);
			customerVO.setName(name);
			customerVO.setAddress(address);

			success = new CustomerHelper().updateCustomer(customerVO);
			if(success == 0) {
				System.out.println("Customer id: "+id+" is not present in DB");
			}
			if (success > 0) {
				System.out.println("Update successful updated customer id: " + id + "");
			}
			resp.sendRedirect("readCustomer");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
