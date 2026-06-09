package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static Connection cn;

	public static Connection openConnection() throws SQLException {
		if (cn == null) {
			String url = "jdbc:mysql://localhost:3306/person";
			String username = "pranavdaund";
			String password = "Pranav@2002";
			cn = DriverManager.getConnection(url, username, password);
		}
		return cn;
	}
}
