package com.training.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUsingPrepared {
	
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/development_training";
		String userName = "root";
		String password = "Chennai@13";

		try {
			Employee emp1 = new Employee();
			emp1.setId(129);
			emp1.setName("Meena");
			emp1.setAge(29);
			
			
			Connection con = DriverManager.getConnection(url, userName, password);
			con.setAutoCommit(false);
			System.out.println("Connected");
			System.out.println(con);
			String query = "insert into employee values (?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setLong(1, emp1.getId());
			stmt.setString(2, emp1.getName());
			stmt.setInt(3, emp1.getAge());
			
			int count = stmt.executeUpdate();
			con.commit();// - : Can't call commit when autocommit=true

			System.out.println(count);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("unable to connect");
			e.printStackTrace();
		}
	}

}
