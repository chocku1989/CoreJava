package com.training.mysqlold;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectionInsertQuery {
	
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/development_training";
		String userName = "root";
		String password = "Chennai@13";

		try {
			Connection con = DriverManager.getConnection(url, userName, password);
			con.setAutoCommit(false);
			System.out.println("Connected");
			System.out.println(con);
			Statement stmt = con.createStatement();
			System.out.println(stmt);
			String query = "insert into employee values (1236,\"Bharathi\",02 )";
			int count = stmt.executeUpdate(query);
			con.commit();// - : Can't call commit when autocommit=true

			System.out.println(count);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("unable to connect");
			e.printStackTrace();
		}
	}

}
