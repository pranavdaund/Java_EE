package org.pranav.tester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDBConnection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String url = "jdbc:mysql://localhost:3306/person";
			String username = "pranav";
			String password = "Pranav@2002";
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println(connection);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
