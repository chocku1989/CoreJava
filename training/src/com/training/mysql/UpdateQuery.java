package com.training.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class UpdateQuery {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		PreparedStatement stmt = null;
		String url = "jdbc:mysql://localhost:3306/development_training";
		String userName = "root";
		String password = "Chennai@13";

		try {

			Employee emp1 = new Employee();
			emp1.setId(1234);
			con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connected");
			System.out.println(con);
			String query = "update employee set name =? where emp_id=?";
			stmt = con.prepareStatement(query);
			System.out.println(stmt);
			stmt.setLong(2, emp1.getId());
			stmt.setString(1, "chocku");
			int count = stmt.executeUpdate();
			System.out.println(count);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			stmt.close();
			con.close();
		}
	}

}
