package com.testscenarios;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.*;

public class SeleniumDataBaseTesting {

	private Connection connection;
	private static Statement statement;
	private static ResultSet rs;

	@BeforeClass
	public void connectingToDatabase() {
		String databaseURL = "jdbc:mysql://localhost:3306/waheeda";
		String username = "root";
		String password = "Karimunisa1#";
		connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connecting to Database...");
			connection = DriverManager.getConnection(databaseURL, username, password);
			if (connection != null) {
				System.out.println("Connected to the Database...");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}

	@Test
	public void getDataFromDataBase() {
		try {
			String query = "select * from Employee;";
			statement = connection.createStatement();
			rs = statement.executeQuery(query);

			while (rs.next()) {
				String Emp_id = rs.getString(1);
				String Emp_name = rs.getString(2);

				System.out.println(Emp_id + "\t" + Emp_name + "\t");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	@AfterClass
	public void closingDatabaseConnection() {
		if (connection != null) {
			try {
				System.out.println("Closing Database Connection...");
				connection.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
}