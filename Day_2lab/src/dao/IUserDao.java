package dao;

import java.sql.SQLException;

public interface IUserDao {

	String getSelectedUserDetails(String email, String password) throws SQLException;
}
