package jdbc_crud;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;
/**
 * @author akash
 */
public class CustomerHelper {

	private CustomerDao customerDao() {
		return new CustomerDaoImpl();
	}

	public ArrayList<CustomerVO> getCustomers() throws SQLException {
		ArrayList<CustomerVO> customers = null;
		CustomerDao dao = customerDao();
		customers = dao.selectAll();
		return customers;
	}

	public int setCustomer(CustomerVO customerVO) throws SQLException {
		if (Objects.nonNull(customerVO)) {
			CustomerDao dao = customerDao();
			return dao.setAll(customerVO);
		}
		return -1;
	}
	
	public int updateCustomer(CustomerVO customerVO) throws SQLException {
		if (Objects.nonNull(customerVO)) {
			CustomerDao dao = customerDao();
			return dao.updateById(customerVO);
		}
		return -1;
	}
	
	public int deleteCustomer(int customerId) throws SQLException {
		if (customerId > 0) {
			CustomerDao dao = customerDao();
			return dao.deleteById(customerId);
		}
		return -1;
	}

}
