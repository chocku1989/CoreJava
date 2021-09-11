package com.training.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class SelectByID {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		//Statement stmt = null;
		PreparedStatement stmt = null;
		String url = "jdbc:mysql://localhost:3306/development_training";
		String userName = "root";
		String password = "Chennai@13";

		try {
			
			Employee emp1 = new Employee();
			emp1.setId(1234);
			emp1.setName("chockalingam");
			con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connected");
			System.out.println(con);
			System.out.println(stmt);
			String query = "select * from employee where emp_id=? and name=?";
//			stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery(query);
			
			stmt=con.prepareStatement(query);
			stmt.setLong(1, emp1.getId());
			stmt.setString(2, emp1.getName());
			ResultSet rs = stmt.executeQuery();
			System.out.println(rs.getMetaData());
			Set<Employee> empSet = new HashSet<Employee>();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getLong(1));
				emp.setName(rs.getString(2));
				emp.setAge(rs.getInt(3));
				empSet.add(emp);

			}
			System.out.println(empSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			stmt.close();
			con.close();
		}
	}

}
