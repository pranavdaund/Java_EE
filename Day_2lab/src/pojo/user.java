package pojo;

import java.sql.Date;

public class user {

	/*
	 * CREATE TABLE users ( id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(20),
	 * email VARCHAR(20) UNIQUE, password VARCHAR(20), reg_amt DOUBLE, reg_date
	 * DATE, role VARCHAR(10) );
	 */

	private int id;
	private String name;
	private String email;
	private String password;
	private double regAmt;
	private Date regDate;
	private String role;

	public user() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getRegAmt() {
		return regAmt;
	}

	public void setRegAmt(double regAmt) {
		this.regAmt = regAmt;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
