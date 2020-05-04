/**
 * 
 */
package jdbc_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Akash
 *
 */
public class CustomerDaoImpl implements CustomerDao {
	private String SELECT_ALL = "SELECT * FROM customer";
	private String INSERT_ALL = "INSERT INTO customer(name, address) VALUES(?,?)";
	private String UPDATE_BY_ID = "UPDATE customer SET name = ?, address = ? WHERE id = ?";
	private String DELETE_BY_ID = "DELETE FROM customer WHERE id = ?";

	public static Connection getConnection() throws SQLException {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Shoping?"+ "autoReconnect=true&useSSL=false", "root", "root");
		} catch (Exception e) {
			throw new SQLException(e + "  DB Connection Problem");
		}
		return con;
	}

	@Override
	public ArrayList<CustomerVO> selectAll() throws SQLException {
		ArrayList<CustomerVO> customerVOs = null;

		Connection con = getConnection();
		if (con != null) {
			try {
				PreparedStatement preparedStatement = con.prepareStatement(SELECT_ALL);
				ResultSet set = preparedStatement.executeQuery();
				customerVOs = new ArrayList<CustomerVO>();
				while (set.next()) {
					CustomerVO customer = new CustomerVO();
					customer.setId(set.getInt("id"));
					customer.setName(set.getString("name"));
					customer.setAddress(set.getString("address"));
					customerVOs.add(customer);
				}
			} catch (Exception e) {
				throw new SQLException(e + "  CAN NOT FETCH customer informations");
			}
		}
		return customerVOs;
	}

	@Override
	public int setAll(CustomerVO customerVO) throws SQLException {
		int result = -1;
		Connection con = getConnection();
		if (con != null) {
			try {
				PreparedStatement preparedStatement = con.prepareStatement(INSERT_ALL);
				preparedStatement.setString(1, customerVO.getName());
				preparedStatement.setString(2, customerVO.getAddress());
				result = preparedStatement.executeUpdate();
			} catch (Exception e) {
				throw new SQLException(e + "  Not able to Insert");
			}
		}
		return result;
	}

	@Override
	public int updateById(CustomerVO customerVO) throws SQLException {
		int result = -1;
		Connection con = getConnection();
		if (con != null) {
			try {
				PreparedStatement preparedStatement = con.prepareStatement(UPDATE_BY_ID);
				preparedStatement.setString(1, customerVO.getName());
				preparedStatement.setString(2, customerVO.getAddress());
				preparedStatement.setInt(3, customerVO.getId());

				result = preparedStatement.executeUpdate();
			} catch (Exception e) {
				throw new SQLException(e + "  Not able to Update");
			}
		}
		return result;
	}

	@Override
	public int deleteById(int id) throws SQLException {
		int result = -1;
		Connection con = getConnection();
		if (con != null) {
			try {
				PreparedStatement preparedStatement = con.prepareStatement(DELETE_BY_ID);
				preparedStatement.setInt(1, id);
				result = preparedStatement.executeUpdate();
			} catch (Exception e) {
				throw new SQLException(e + "  Not able to Delete");
			}
		}
		return result;
	}

}
