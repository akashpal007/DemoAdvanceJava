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
@WebServlet("/deleteCustomer")
public class DeleteCustomer extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8583393487699554152L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id = Integer.parseInt(req.getParameter("id"));
		int success = -1;
		try {
			success = new CustomerHelper().deleteCustomer(id);
			if(success == 0) {
				System.out.println("Customer id: "+id+" is not present in DB");
			}
			if(success > 0) {
				System.out.println("Delete successful Deleted customer id: "+id+"");
			}
			resp.sendRedirect("readCustomer");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
