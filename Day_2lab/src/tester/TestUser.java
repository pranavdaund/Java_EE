package tester;

import java.util.Scanner;

import dao.UserDaoImp;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			UserDaoImp dao = new UserDaoImp();

			System.out.println("Enter email");
			String email = sc.next();

			System.out.println("Enter Password");
			String password = sc.next();

			String update = dao.getSelectedUserDetails(email, password);
			System.out.println(update);

			dao.cleanUP();

		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}

	}

}
