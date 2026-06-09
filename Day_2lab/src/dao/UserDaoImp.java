package dao;

import static util.DBUtil.openConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImp implements IUserDao {

	private Connection cn;
	private PreparedStatement pst1;

	public UserDaoImp() throws SQLException {
		// TODO Auto-generated constructor stub

		cn = openConnection();

		pst1 = cn.prepareStatement("select * from users where email = ? and password = ?;");

	}

	@Override
	public String getSelectedUserDetails(String email, String password) throws SQLException {
		// TODO Auto-generated method stub
		pst1.setString(1, email);
		pst1.setString(2, password);

		try (ResultSet rst = pst1.executeQuery()) {
			if (rst.next()) {
				// id name email password reg_amt reg_date role
//				System.out.println("User id: " + rst.getInt(1) + " Name: " + rst.getString(2) + " Email: "
//						+ rst.getString(3) + " Password: " + rst.getString(4) + " Registration Amount: "
//						+ rst.getDouble(5) + " Registration Date: " + rst.getDate(6) + " Role: " + rst.getString(7));

				return "Login successful";
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "login Failed";

	}

	public void cleanUP() throws SQLException {
		if (pst1 != null) {
			pst1.close();
		}
		if (cn != null) {
			cn.close();
		}
	}

}
