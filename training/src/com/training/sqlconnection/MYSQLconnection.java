package com.training.sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MYSQLconnection {

	public static void queryDB() throws SQLException {

//		Connection con = null;
//		Statement stmt = null;
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/development_trainin, "root",
//					"Chennai@13");

			String url = "jdbc:mysql://localhost:3306/development_training";
			String userName = "root";
			String password = "Chennai@13";

			Connection con = DriverManager.getConnection(url, userName, password);

			System.out.println(con.toString());
			Statement stmt = con.createStatement();
			System.out.println(stmt);
			String query = "insert into employee values (1234,\"Chockalingam\",32 )";
			int count = stmt.executeUpdate(query);
			System.out.println(count);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		} finally {
//			if (stmt != null) {
//				stmt.close();
//			}
//			if (con != null) {
//				con.close();
//			}
//		}

	}

	public static void main(String[] args) throws SQLException {

		queryDB();
	}
}
