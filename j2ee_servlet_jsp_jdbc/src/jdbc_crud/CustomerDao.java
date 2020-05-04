package jdbc_crud;

import java.sql.SQLException;
import java.util.ArrayList;
/**
 * @author akash
 */
public interface CustomerDao {

	public ArrayList<CustomerVO> selectAll() throws SQLException;

	public int setAll(CustomerVO customerVO) throws SQLException;

	public int updateById(CustomerVO customerVO) throws SQLException;

	public int deleteById(int customerId) throws SQLException;

}
